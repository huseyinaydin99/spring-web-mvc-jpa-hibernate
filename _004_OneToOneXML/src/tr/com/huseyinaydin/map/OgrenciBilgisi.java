package tr.com.huseyinaydin.map;

import java.io.Serializable;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public class OgrenciBilgisi implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer ogrenciId;
	private String adres;
	private String email;

	private Ogrenci ogrenci;

	public OgrenciBilgisi() {
	}

	public OgrenciBilgisi(Integer ogrenciId, String adres, String email, Ogrenci ogrenci) {
		super();
		this.ogrenciId = ogrenciId;
		this.adres = adres;
		this.email = email;
		this.ogrenci = ogrenci;
	}

	public Integer getOgrenciId() {
		return ogrenciId;
	}

	public void setOgrenciId(Integer ogrenciId) {
		this.ogrenciId = ogrenciId;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}
}