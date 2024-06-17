package tr.com.huseyinaydin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public class Merkez {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Yazar yazar = context.getBean("yazarBean",Yazar.class);
		
		System.out.println("YAZAR   : " + yazar.getYazarAdi() + " " + yazar.getYazarSoyadi());
		System.out.println("KITAP   : " + yazar.getKitap().getEserAdi());
		System.out.println("ISBN   : " + yazar.getKitap().getEserISBN());	
	}
}