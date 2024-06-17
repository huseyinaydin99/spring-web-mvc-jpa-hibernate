package tr.com.huseyinaydin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

// @Entity
// @Table(name="PERSONEL")
public class Personel {

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="ID", nullable = false )
	private int personelId;	
	
//	@Column(name="ADI", nullable = false, length=50 )
	private String personelAdi;
	
//	@Column(name="SOYADI", nullable = false, length=60 )
	private String personelSoyadi;
	
//	@Column(name="EPOSTA", nullable = false, length=100 )
	private String personelEmail;
	//-------------------------------------------------------------------
	
	public Personel() {
	}

	public Personel(int personelId, String personelAdi, String personelSoyadi, String personelEmail) {
		this.personelId = personelId;
		this.personelAdi = personelAdi;
		this.personelSoyadi = personelSoyadi;
		this.personelEmail = personelEmail;
	}

	public int getPersonelId() {
		return personelId;
	}
	
	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}

	public String getPersonelAdi() {
		return personelAdi;
	}
	
	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}

	public String getPersonelSoyadi() {
		return personelSoyadi;
	}
	
	public void setPersonelSoyadi(String personelSoyadi) {
		this.personelSoyadi = personelSoyadi;
	}

	public String getPersonelEmail() {
		return personelEmail;
	}
	
	public void setPersonelEmail(String personelEmail) {
		this.personelEmail = personelEmail;
	}
}