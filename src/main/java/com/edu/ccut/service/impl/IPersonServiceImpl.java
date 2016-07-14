package com.edu.ccut.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.edu.ccut.controller.PersonController;
import com.edu.ccut.dao.CompanyMapper;
import com.edu.ccut.dao.PersonMapper;
import com.edu.ccut.dao.SystemseqMapper;
import com.edu.ccut.pojo.Company;
import com.edu.ccut.pojo.Person;
import com.edu.ccut.pojo.Systemseq;
import com.edu.ccut.service.IPersonService;

/**
 *@author zhongyuan
 *@date 2016年7月12日
 */
@Service
public class IPersonServiceImpl implements IPersonService {

	private static Logger logger = Logger.getLogger(IPersonServiceImpl.class);
	
	@Resource
	private PersonMapper personMapper;
	
	@Resource
	private CompanyMapper companyMapper;
	
	@Resource
	private SystemseqMapper systemseqMapper;
	
	@Override
	public boolean savePerson(Person p) {
		Systemseq s = systemseqMapper.selectByPrimaryKey(2);
		Company c = companyMapper.selectByUnitAccNum(p.getUnitaccnum());
		/**生成个人公积金账号 start  ***/
		int seq = s.getSeq();
		String r = String.format("%06d", seq);
		Long r1 = (long) (Math.random()*100000);
		String accnum = "p" + r + Long.toString(r1);
		logger.info(accnum+":***----***:"+accnum.length());
		
		p.setAccnum(accnum);  
		/**生成个人公积金账号 end  ***/
		Date date = new Date();
		p.setOpendate(date);
		s.setSeq(seq+1);
		p.setUnitprop(c.getUnitprop());
		p.setIndiprop(c.getPerprop());
		logger.info("个人比例:"+p.getIndiprop());
		p.setUnitmonpaysum(p.getBasenumber().multiply(p.getUnitprop()));//单位月应缴额
		p.setPermonpaysum(p.getBasenumber().multiply(p.getIndiprop()));//个人月应缴额
		BigDecimal cbasenumber = c.getBasenumber().add(p.getBasenumber());
		c.setBalance(c.getBalance().add(p.getBalance()));
		c.setBasenumber(cbasenumber);//单位缴存基数之和
		c.setUnitpaysum(c.getUnitpaysum().add(p.getUnitmonpaysum())); //单位月应缴额之和
		c.setPerpaysum(c.getPerpaysum().add(p.getPermonpaysum()));    //个人月应缴额之和
		logger.info(p.getPermonpaysum());
		c.setPersnum(c.getPersnum()+1);
		companyMapper.updateByPrimaryKey(c);
		systemseqMapper.updateByPrimaryKeySelective(s);
		int flag = personMapper.insert(p);
		if(flag>0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public List<Person> getAllPerson() {
		List<Person> ap = personMapper.getAllPerson();
		return ap;
	}

	@Override
	public boolean updatePerson(Person p) {
		// TODO Auto-generated method stub
		int flag = personMapper.updateByPrimaryKey(p);
		if(flag>0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Person getPerson(Integer id) {
		// TODO Auto-generated method stub
		return personMapper.selectByPrimaryKey(id);
	}
	
}
