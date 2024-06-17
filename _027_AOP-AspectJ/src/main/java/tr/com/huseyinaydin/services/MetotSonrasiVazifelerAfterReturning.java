package tr.com.huseyinaydin.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
public class MetotSonrasiVazifelerAfterReturning  {

	@AfterReturning (pointcut =  "execution(* tr.com.huseyinaydin.model.Personel.*(..)) ", returning = "sonuc")
	public void sonraCalis(JoinPoint joinPoint, Object sonuc)  {
		System.out.println("====METOT SONRASI=====");
		System.out.println("----METOD ADI: " + joinPoint.getSignature().getName()  + " GERI DONUS DEGERI: "+ sonuc );
	}
}