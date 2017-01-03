package com.edu.ccut.test;

import java.util.Date;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.edu.ccut.pojo.Member;
import com.edu.ccut.service.IMemberService;
import com.edu.ccut.service.IMessageImgService;
import com.edu.ccut.util.MD5Util;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试  
@ContextConfiguration   
({"classpath:spring-mybatis.xml"}) //加载配置文件  
  
//------------如果加入以下代码，所有继承该类的测试类都会遵循该配置，也可以不加，在测试类的方法上///控制事务，参见下一个实例  
//这个非常关键，如果不加入这个注解配置，事务控制就会完全失效！  
//@Transactional  
//这里的事务关联到配置文件中的事务控制器（transactionManager = "transactionManager"），同时//指定自动回滚（defaultRollback = true）。这样做操作的数据才不会污染数据库！  
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)  
//------------ 
public class TestMain  {

	private static final Logger logger = Logger.getLogger(TestMain.class);
	
	@Resource
	IMessageImgService imgservice;
	
	@Resource
	IMemberService memberService;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
	}
	
	@Test
    @Transactional   //标明此方法需使用事务  
	public void test(){
		Member member = new Member();
		member.setCipher(MD5Util.getMD5Code("123456"));
		member.setScreenName("testabc");
		member.setEmail("abc@qq.com");
		member.setLevel(1);
		member.setState(1);
		member.setCreatedate(new Date());
		logger.info("1111111111111111111111111111");
		memberService.addMember(member);
	}
}
