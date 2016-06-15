package com.edu.ccut.controller;

import com.alibaba.fastjson.JSON;
import com.edu.ccut.pojo.Member;
import com.edu.ccut.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * Created by zhongyuan on 2016/5/11.
 */

@RunWith(SpringJUnit4ClassRunner.class)		//��ʾ�̳���SpringJUnit4ClassRunner��
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestController {
    private static Logger logger = Logger.getLogger(TestController.class);
    //	private ApplicationContext ac = null;
    @Resource
    private IUserService userService = null;
//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

    @Test
    public void test1() {
        Member member = userService.getMemberById(3);
        System.out.println(member.getMembername());
        // logger.info("ֵ��"+user.getUserName());
        logger.info("1111111111111111111111111111111111111111111111::"+JSON.toJSONString(member));
    }
}
