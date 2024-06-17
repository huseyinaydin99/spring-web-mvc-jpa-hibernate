package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public class Ucgen {

	private String cesit;
	private int yukseklik;

	public Ucgen() {
	}

	public Ucgen(String cesit) {
		this.cesit = cesit;
	}

	public Ucgen(String cesit, int yukseklik) {
		this.cesit = cesit;
		this.yukseklik = yukseklik;
	}

	public String getCesit() {
		return cesit;
	}

	public void setCesit(String cesit) {
		this.cesit = cesit;
	}

	public int getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}

	public void ciz() {
		System.out.println(getCesit() + " ucgen cizildi.");
		System.out.println(getYukseklik() + "  birim");
	}
}