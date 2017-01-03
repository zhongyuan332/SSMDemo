package com.edu.ccut.util.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component // 注入依赖
@Aspect // 该注解标示该类为切面类
public class LogServiceAop {
	private static final Logger logger = Logger.getLogger(LogServiceAop.class);

	@Pointcut("execution(* com.edu.ccut.service.impl.*ServiceImpl.*(..))")
	public void logAop(JoinPoint jp) {
	}

	@Before("logAop() && args(name)")
	public void logBefore(String name) {
		System.out.println(name + "前置通知Before");
	}

	@AfterReturning("logAop()")
	public void logAfterReturning() {
		System.out.println("返回通知AfterReturning");
	}

	@After("logAop() && args(name)")
	public void logAfter(String name) {
		System.out.println(name + "后置通知After");
	}

	@AfterThrowing("logAop()")
	public void logAfterThrow() {
		System.out.println("异常通知AfterThrowing");
	}

}
