package org.turkeyjug.dao;

import java.util.List;

import org.turkeyjug.model.Personel;

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