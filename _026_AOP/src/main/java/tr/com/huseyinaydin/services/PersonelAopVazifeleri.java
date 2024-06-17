package tr.com.huseyinaydin.services;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public class PersonelAopVazifeleri implements MethodBeforeAdvice, ThrowsAdvice, MethodInterceptor, AfterReturningAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("\n+++++METOTTAN ONCE+++++");
	}

	public void afterThrowing(IllegalArgumentException ex) throws Throwable {
		System.out.println("????? METOTTAKI ISTISNADAN SONRA ?????");
	}

	public void afterReturning(Object returnValue, Method metotAdi, Object[] args, Object hedef) throws Throwable {
		System.out.println("====METOT SONRASI=====");
	}

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		try {
			if ("selamlamaYap".equals(methodInvocation.getMethod().getName())) {
				System.out.println("\n&&&&& METOTTAN ONCE &&&&&");
				System.out.println("METODUN ADI:" + methodInvocation.getMethod().getName());
				System.out.println("METODUN ARGUMENTLERI:" + Arrays.toString(methodInvocation.getArguments()));
				Object sonuc = methodInvocation.proceed();
				System.out.println("&&&&& METOTTAN SONRASI &&&&&");
			}
			/*
			 * Object sonuc = methodInvocation.proceed();
			 * System.out.println("&&&&& METOTTAN SONRASI &&&&&");
			 */
		} catch (IllegalArgumentException e) {
			System.out.println("&&&&& ISTISNA SONRASI &&&&&");
			throw e;
		}
		return null;
	}
}