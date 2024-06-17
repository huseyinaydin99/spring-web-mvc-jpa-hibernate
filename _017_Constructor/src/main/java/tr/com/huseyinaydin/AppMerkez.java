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

public class AppMerkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		//BeanFactory beanFactory =context;
		
		//Ucgen ucgen1 = (Ucgen) context.getBean("ucgenSetter");
		//ucgen1.ciz();
		
		Ucgen ucgen = (Ucgen) context.getBean("ucgenHazirlayici2");
		ucgen.ciz();
	}
}