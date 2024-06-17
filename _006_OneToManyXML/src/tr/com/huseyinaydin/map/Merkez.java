package tr.com.huseyinaydin.map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tr.com.huseyinaydin.util.HibernateUtil;

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
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			
			Departman departman = new Departman();
			departman.setDepartmanAdi("Yazilim");
			session.save(departman);
			
			Calisan calisan1 = new Calisan("Hüseyin", "Aydın");
			Calisan calisan2 = new Calisan("Yasemin", "Ateş");
			Calisan calisan3 = new Calisan("Şirin", "Şimşek");
			
			calisan1.setDepartman(departman);
			calisan2.setDepartman(departman);
			calisan3.setDepartman(departman);
	
			session.save(calisan1);
			session.save(calisan2);
			session.save(calisan3);		
			
			System.out.println("Kaydedildi.");
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();	
		}finally {
			session.close();
		}
	}
}