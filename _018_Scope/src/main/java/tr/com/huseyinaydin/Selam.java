package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public class Selam {

	private String mesaj;

	public Selam() {
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	public void sonuc() {
		System.out.println(getMesaj());
	}	
}