package tr.com.huseyinaydin.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public class HibernateUtil {

	private static final SessionFactory sessionFactory = olusturSessionFactory();

	private static SessionFactory olusturSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			return null;
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

	public static void shutDown() {
		olusturSessionFactory().close();
	}
}