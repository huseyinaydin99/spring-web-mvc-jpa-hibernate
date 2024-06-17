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

		Ders ders = (Ders) context.getBean("dersBean");

		System.out.println("ADI    : " + ders.getOgrenci().getAdi());
		System.out.println("SOYADI : " + ders.getOgrenci().getSoyadi());
		System.out.println("YAŞI   : " + ders.getOgrenci().getYasi());

		System.out.println("DERS   : " + ders.getDersAdi());
		System.out.println("PUAN   : " + ders.getPuan());

		((ConfigurableApplicationContext) context).close();
	}
}