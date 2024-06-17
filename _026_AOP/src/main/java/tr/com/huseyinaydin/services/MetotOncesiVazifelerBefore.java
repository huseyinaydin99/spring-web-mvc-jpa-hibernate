package tr.com.huseyinaydin.services;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public class MetotOncesiVazifelerBefore implements MethodBeforeAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("\n+++++METOTTAN ONCE+++++");
	}
}