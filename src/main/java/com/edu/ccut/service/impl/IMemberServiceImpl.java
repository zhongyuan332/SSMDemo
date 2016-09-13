package com.edu.ccut.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.edu.ccut.controller.UserController;
import com.edu.ccut.dao.MemberMapper;
import com.edu.ccut.pojo.Member;
import com.edu.ccut.service.IMemberService;
import com.edu.ccut.util.GetInfomation;
import com.edu.ccut.util.MD5Util;
import com.edu.ccut.util.SendEmail;

/**
 *@author zhongyuan
 *@date 2016年7月31日
 */
@Service("memberService")
public class IMemberServiceImpl implements IMemberService {
	
	private static Logger logger = Logger.getLogger(IMemberServiceImpl.class);
	
	@Resource
	private MemberMapper memberDao;
	
	@Override
	public boolean saveMember(Member member) {
		// TODO Auto-generated method stub
		member.setCreatedate(new Date());
		member.setState(0);
		member.setLevel(0);
		member.setEmail(member.getUsername());
		member.setCipher(MD5Util.getMD5Code(member.getCipher()));
		member.setValidatecode(MD5Util.encode2hex(member.getUsername()));

		 ///邮件的内容
        StringBuffer sb=new StringBuffer("点击下面链接激活账号，24小时生效，否则重新注册账号，链接只能使用一次，请尽快激活！<br>");
        sb.append("http://localhost:8080/touch/member/validate?email="); 
        sb.append(member.getEmail());
        sb.append("&validatecode=");
        sb.append(member.getValidatecode());
        sb.append("");
        
        //发送邮件
        SendEmail.send(member.getEmail(), sb.toString());
        logger.info("--已发送邮件--");
		int flag = memberDao.insert(member);
		if(flag>0){
			return true;
		}else{
			return false;
	
		}
	}

	@Override
	public boolean validateMember(Member member) {
		Member vm = memberDao.getMemberByEmail(member.getEmail());
		boolean time24 = false;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			logger.info(format.format(vm.getCreatedate()));
			logger.info(format.format(new Date()));
			time24 = GetInfomation.judgmentDate(format.format(vm.getCreatedate()),format.format(new Date()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean validate = member.getValidatecode().equals(vm.getValidatecode());
		if(time24&&validate){
			vm.setState(1);
			int a = memberDao.updateByPrimaryKey(vm);
			logger.info(a);
			return true;
		}else {
			return false;
		}
	}
	
	
}
