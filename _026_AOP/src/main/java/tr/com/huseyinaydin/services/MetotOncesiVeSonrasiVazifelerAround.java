package tr.com.huseyinaydin.services;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public class MetotOncesiVeSonrasiVazifelerAround implements MethodInterceptor {

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
		 Object sonuc = methodInvocation.proceed();
		 System.out.println("&&&&& METOTTAN SONRASI &&&&&");
		*/
		} catch (IllegalArgumentException e) {
			System.out.println("&&&&& ISTISNA SONRASI &&&&&");
			throw e;
		}
		//if("bilgiVer".equals(methodInvocation.getMethod().getName()))		
		return null;
	}
}