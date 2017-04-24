package com.quanwugou.springmvc.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAspect {
	@Pointcut("execution(* com.quanwugou.springmvc.service.impl.TestServiceImpl.*(..))")
	private void anyMethod() {
	}// ����һ�������

	@Before("anyMethod() && args(name)")
	public void doAccessCheck(String name) {
		System.out.println(name);
		System.out.println("ǰ��֪ͨ");
	}

	@AfterReturning("anyMethod()")
	public void doAfter() {
		System.out.println("����֪ͨ");
	}

	@After("anyMethod()")
	public void after() {
		System.out.println("����֪ͨ");
	}

	@AfterThrowing("anyMethod()")
	public void doAfterThrow() {
		System.out.println("����֪ͨ");
	}

	@Around("anyMethod()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("���뻷��֪ͨ");
		Object object = pjp.proceed();// ִ�и÷���
		System.out.println("�˳�����");
		return object;
	}
}
