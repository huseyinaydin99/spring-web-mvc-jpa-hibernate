package tr.com.huseyinaydin.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

@Aspect
public class MetotOncesiVazifelerBefore  {

    @Before(value = "execution(* tr.com.huseyinaydin.model.Personel.*(..)) ")
	public void ilkGorev(JoinPoint joinPoint)  {
		System.out.println("\n+++++METOTTAN ONCE+++++");
		System.out.println("----METOD ADI: " + joinPoint.getSignature().getName());
	}
}