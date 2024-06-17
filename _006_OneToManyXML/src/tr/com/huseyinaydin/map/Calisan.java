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

public class Calisan implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer calisanId;
	private String calisanAdi;
	private String calisanSoyadi;	
	private Departman  departman;
	
	public Calisan() {
	}

	public Calisan(String calisanAdi, String calisanSoyadi) {
		this.calisanAdi = calisanAdi;
		this.calisanSoyadi = calisanSoyadi;
	}

	public Integer getCalisanId() {
		return calisanId;
	}

	public void setCalisanId(Integer calisanId) {
		this.calisanId = calisanId;
	}

	public String getCalisanAdi() {
		return calisanAdi;
	}

	public void setCalisanAdi(String calisanAdi) {
		this.calisanAdi = calisanAdi;
	}

	public String getCalisanSoyadi() {
		return calisanSoyadi;
	}

	public void setCalisanSoyadi(String calisanSoyadi) {
		this.calisanSoyadi = calisanSoyadi;
	}

	public Departman getDepartman() {
		return departman;
	}

	public void setDepartman(Departman departman) {
		this.departman = departman;
	}
}