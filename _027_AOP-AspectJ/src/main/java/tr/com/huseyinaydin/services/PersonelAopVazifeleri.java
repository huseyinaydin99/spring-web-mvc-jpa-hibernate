package tr.com.huseyinaydin.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
public class PersonelAopVazifeleri {
  /*
    @Before(value = "execution(* tr.com.huseyinaydin.model.Personel.*(..)) ")
	public void ilkGorev(JoinPoint joinPoint)  {
		System.out.println("\n+++++METOTTAN ONCE+++++");
		System.out.println("----METOD ADI: " + joinPoint.getSignature().getName());
	}
    
	@AfterReturning (pointcut =  "execution(* tr.com.huseyinaydin.model.Personel.*(..)) ", returning = "sonuc")
	public void sonraCalis(JoinPoint joinPoint, Object sonuc)  {
		System.out.println("====METOT GERI DONUS DEGERI SONRASI=====");
		System.out.println("----METOD ADI: " + joinPoint.getSignature().getName()  + " GERI DONUS DEGERI: "+ sonuc );
	}

	@AfterThrowing (pointcut =  "execution(* tr.com.huseyinaydin.model.Personel.adiSoyadiKontrolEt(..)) ")
	public void istisnaSonrasi(JoinPoint joinPoint)  {
		System.out.println("====METOT ISTISNA SONRASI=====");
		System.out.println("----METOD ADI: " + joinPoint.getSignature().getName() );
	}
	
	@After (value =  "execution(* tr.com.huseyinaydin.model.Personel.*(..)) ")
	public void sonraCalis(JoinPoint joinPoint)  {
		System.out.println("====METOT SONRASI=====");
		System.out.println("----METOD ADI: " + joinPoint.getSignature().getName()   );
	}
	*/
	
	@Around(value = "execution(* tr.com.huseyinaydin.model.Personel.*(..)) ")
	public void kusatmaMetodu(ProceedingJoinPoint joinPoint) throws Throwable  {
		System.out.println("\n+++++METOTTAN ONCE+++++");
		System.out.println("----METOD ADI: " + joinPoint.getSignature().getName());
		joinPoint.proceed();
		System.out.println("====METOT SONRASI=====");		
	}	
}