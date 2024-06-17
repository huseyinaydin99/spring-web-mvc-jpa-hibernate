package tr.com.huseyinaydin;

import org.springframework.beans.factory.annotation.Required;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public class Ogrenci {

	private Integer yasi;
	private String adi, soyadi;

	public Integer getYasi() {
		return yasi;
	}

	@Required
	public void setYasi(Integer yasi) {
		this.yasi = yasi;
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
}