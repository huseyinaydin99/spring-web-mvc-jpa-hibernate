package tr.com.huseyinaydin.services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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
public class MetotOncesiVeSonrasiVazifelerAround {

	@Around(value = "execution(* tr.com.huseyinaydin.model.Personel.*(..)) ")
	public void kusatmaMetodu(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("\n+++++METOTTAN ONCE+++++");
		System.out.println("----METOD ADI: " + joinPoint.getSignature().getName());
		joinPoint.proceed();
		System.out.println("====METOT SONRASI=====");
	}
}