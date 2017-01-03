package com.edu.ccut.util.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogServiceAop {
	private static final Logger logger = Logger.getLogger(LogServiceAop.class);
	
	@After("execution(* com.edu.ccut.service.impl.*ServiceImpl.*(..))")
	public void printMethodName(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		// 不包含query和get
		logger.info("----****----:"+methodName);
	}
}
