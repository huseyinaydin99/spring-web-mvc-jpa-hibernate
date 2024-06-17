package tr.com.huseyinaydin.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

@XmlRootElement(name="personeller")
public class PersonelList {

	private List<Personel> personel = new ArrayList<Personel>();

	public List<Personel> getPersonel() {
		return personel;
	}

	public void setPersonel(List<Personel> personel) {
		this.personel = personel;
	}	
}