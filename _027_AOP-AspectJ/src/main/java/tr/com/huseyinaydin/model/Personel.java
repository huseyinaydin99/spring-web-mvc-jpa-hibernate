package tr.com.huseyinaydin.model;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public class Personel {

	private String adi;
	private String soyadi;
	private int yasi;
	
	public void adiSoyadiKontrolEt() {
		System.out.println("-----adiSoyadiKontrolEt()----");	
		if (getAdi().length() < 2  || getSoyadi().length() < 2 ) {
			throw new IllegalArgumentException();
		}	
	}

	public void selamlamaYap() {
		System.out.println("-----selamlamaYap()----");	
		System.out.println("Selamlar " + getAdi() + " " + getSoyadi() + " - " + getYasi());
	}

	public void bilgiAl() {
		System.out.println("-----bilgiAl()----");	
		System.out.println("ADI SOYADI:" + getAdi() + " " + getSoyadi() );
		System.out.println("YASI: " + getYasi());
	}
	
	public void selamVer() {
		System.out.println("MERHABA ");
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
	
	public int getYasi() {
		return yasi;
	}
	
	public void setYasi(int yasi) {
		this.yasi = yasi;
	}	
}