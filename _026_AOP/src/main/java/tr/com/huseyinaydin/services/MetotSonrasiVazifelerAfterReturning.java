package tr.com.huseyinaydin.services;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public class MetotSonrasiVazifelerAfterReturning implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method metotAdi, Object[] args, Object hedef) throws Throwable {
		System.out.println("====METOT SONRASI=====");
	}
}