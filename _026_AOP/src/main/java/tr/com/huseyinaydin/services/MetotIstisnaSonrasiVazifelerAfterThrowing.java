package tr.com.huseyinaydin.services;

import org.springframework.aop.ThrowsAdvice;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public class MetotIstisnaSonrasiVazifelerAfterThrowing implements ThrowsAdvice {

	public void afterThrowing(IllegalArgumentException ex) throws Throwable {
		System.out.println("????? METOTTAKI ISTISNADAN SONRA ?????");
	}
}