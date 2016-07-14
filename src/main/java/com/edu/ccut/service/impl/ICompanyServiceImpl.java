package com.edu.ccut.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.edu.ccut.controller.MemberController;
import com.edu.ccut.dao.CompanyMapper;
import com.edu.ccut.dao.SystemseqMapper;
import com.edu.ccut.pojo.Company;
import com.edu.ccut.pojo.Systemseq;
import com.edu.ccut.service.ICompanyService;

/**
 *@author zhongyuan
 *@date 2016年7月11日
 */
@Service
public class ICompanyServiceImpl implements ICompanyService {

    private static Logger logger = Logger.getLogger(ICompanyServiceImpl.class);

	@Resource
	private CompanyMapper companyMapper;
	
	@Resource
	private SystemseqMapper systemseqMapper;
	
	@Override
	public boolean saveCompany(Company c) {
		Systemseq s = systemseqMapper.selectByPrimaryKey(1);
		int seq = s.getSeq();
		String r = String.format("%06d", seq);
		Long r1 = (long) (Math.random()*100000);
		String unitaccnum = "c" + r + Long.toString(r1);
		logger.info(unitaccnum+":***----***:"+unitaccnum.length());
		c.setOrgcode(Long.toString(r1));
		c.setUnitaccnum(unitaccnum);
		Date date = new Date();
		c.setCreatedate(date);
		s.setSeq(seq+1);
		logger.info(c.getAccstate());
		systemseqMapper.updateByPrimaryKeySelective(s);
		int flag = companyMapper.insert(c);
		if(flag>0){
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<Company> getAllCompany() {
		// TODO Auto-generated method stub
		List<Company> list = companyMapper.getAllCompany();
		return list;
	}

	@Override
	public boolean isHaveCompany(String unitaccnum) {
		// TODO Auto-generated method stub
		Company c = companyMapper.selectByUnitAccNum(unitaccnum);
		if(c==null){
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean updateCompany(Company c) {
		// TODO Auto-generated method stub
		int flag = companyMapper.updateByPrimaryKey(c);
		if(flag>0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Company getCompany(Integer id) {
		// TODO Auto-generated method stub
		return companyMapper.selectByPrimaryKey(id);
	}

}
