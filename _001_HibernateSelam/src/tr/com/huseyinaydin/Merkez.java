package tr.com.huseyinaydin;

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

public class Merkez {

	public static void main(String[] args) {
		Personel personel = new Personel();
		//personel.setPersonelId(1);
		personel.setPersonelAdi("Hüseyin");
		personel.setPersonelSoyadi("Aydın");
		personel.setPersonelEmail("huseyinaydin99@gmail.com");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(personel);
		session.getTransaction().commit();
	}
}