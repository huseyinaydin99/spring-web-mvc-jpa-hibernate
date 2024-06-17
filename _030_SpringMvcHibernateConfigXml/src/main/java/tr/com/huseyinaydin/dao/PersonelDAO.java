package tr.com.huseyinaydin.dao;

import java.util.List;

import tr.com.huseyinaydin.model.Personel;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public interface PersonelDAO {
	public Personel get(int id);
	public List<Personel> list();
	public void saveOrUpdate (Personel personel); 
	public void delete (int id); 	
}