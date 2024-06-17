package tr.com.huseyinaydin;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
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
		//BeanFactory beanFactory =context;
		
		Selam selamNesnesi1 = (Selam) context.getBean("selam");		
		selamNesnesi1.setMesaj("Bilişim, yazılım teknolojileri insanoğlunun şu ana kadar ki elde edebildiği en üstün şey ve süper güce en yakın şeydir.");
		selamNesnesi1.sonuc();
			
		Selam selamNesnesi2 = (Selam) context.getBean("selam");	
		selamNesnesi2.sonuc();
		
		System.out.println(selamNesnesi1);
		System.out.println(selamNesnesi2);		
	}
}