package tr.com.huseyinaydin.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tr.com.huseyinaydin.model.Personel;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

//Starting the JVM with --add-reads modules=ALL-UNNAMED may fix the problem.

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		Personel personel = context.getBean("personelProxyFactoryBean", Personel.class);
		try {
			personel.adiSoyadiKontrolEt();
			personel.bilgiAl();
			personel.selamlamaYap();			
		} catch (Exception e) {
			System.out.println("HATA MEYDANA GELDI : "+ e);
		}
		((ConfigurableApplicationContext) context).close();
	}
}