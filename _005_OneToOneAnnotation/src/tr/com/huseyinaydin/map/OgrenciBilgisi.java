package tr.com.huseyinaydin.map;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Spring Web MVC ve JPA Hibernate
 *
 */

@Entity
@Table(name = "tblogrencibilgisi")
public class OgrenciBilgisi implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "ogrenci"))

	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "OGRENCI_ID", unique = true, nullable = true)
	private Integer ogrenciId;
	private String adres;
	private String email;

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Ogrenci ogrenci;

	public OgrenciBilgisi() {
		// TODO Auto-generated constructor stub
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