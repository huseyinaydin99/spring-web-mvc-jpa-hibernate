package tr.com.huseyinaydin.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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

			OgrenciBilgisi ogrenciBilgisi = new OgrenciBilgisi();
			ogrenciBilgisi.setAdres("Niğde/Merkez");
			ogrenciBilgisi.setEmail("huseyinaydin99@gmail.com");

			Ogrenci ogrenci = new Ogrenci();
			ogrenci.setOgrenciAdi("Hüseyin");
			ogrenci.setOgrenciSoyadi("Aydın");
			ogrenci.setOgrenciBilgisi(ogrenciBilgisi);

			session.save(ogrenci);
			System.out.println("Kaydedildi.");

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}