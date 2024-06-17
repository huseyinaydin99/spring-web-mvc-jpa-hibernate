package tr.com.huseyinaydin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Spring Web MVC ve JPA Hibernate
 *
 */

@Entity
@Table(name = "PERSONEL")
@XmlRootElement(name = "personel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Personel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@XmlElement // (name="iddegeri")
	private int id;

	@Column
	@XmlElement
	private String adi;

	@Column
	@XmlElement
	private String soyadi;

	@Column
	@XmlElement
	private String email;

	public Personel() {
	}

	public Personel(String adi, String soyadi, String email) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}