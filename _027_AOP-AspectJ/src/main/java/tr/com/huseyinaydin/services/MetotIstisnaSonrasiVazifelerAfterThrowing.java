package tr.com.huseyinaydin.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

@Aspect
public class MetotIstisnaSonrasiVazifelerAfterThrowing  {

	@AfterThrowing (pointcut =  "execution(* tr.com.huseyinaydin.model.Personel.adiSoyadiKontrolEt(..)) ")
	public void istisnaSonrasi(JoinPoint joinPoint)  {
		System.out.println("====METOT ISTISNA SONRASI=====");
		System.out.println("----METOD ADI: " + joinPoint.getSignature().getName() );
	}
}