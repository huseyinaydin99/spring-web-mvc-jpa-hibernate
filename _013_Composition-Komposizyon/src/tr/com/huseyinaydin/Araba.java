package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

public class Araba {

	private Yakit yakit;
	
	public Araba() {
		this.yakit = new Yakit();
	}
	
	public void anahtariCevir() {
		yakit.bilgiAl();
		System.out.println("Araba calisiyor...");
	}	
}