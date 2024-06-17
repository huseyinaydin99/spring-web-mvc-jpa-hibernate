package tr.com.huseyinaydin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tr.com.huseyinaydin.dao.PersonelDAO;
import tr.com.huseyinaydin.model.Personel;
import tr.com.huseyinaydin.model.PersonelList;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Spring Web MVC ve JPA Hibernate
 *
 */

@RestController
public class PersonelRestController {

	@Autowired
	private PersonelDAO personelDAO;

//	http://localhost:8080/{}/{soyadi}/{email}.xml
	@RequestMapping(value = "/{adi}/{soyadi}/{email}.xml", method = RequestMethod.GET, produces = "application/xml; charset=UTF-8")
	public Personel uretxml(@PathVariable("adi") String adi, @PathVariable("soyadi") String soyadi,
			@PathVariable("email") String email) {
		Personel personel = new Personel(adi, soyadi, email);
		return personel;
	}

//	http://localhost:8080/{adi}/{soyadi}/{email}.json
	@RequestMapping(value = "/{adi}/{soyadi}/{email}.json", method = RequestMethod.GET, headers = "Accept=application/json", produces = "application/json; charset=UTF-8")
	public Personel uretjson(@PathVariable("adi") String adi, @PathVariable("soyadi") String soyadi,
			@PathVariable("email") String email) {
		Personel personel = new Personel(adi, soyadi, email);
		return personel;
	}

//	http://localhost:8080/xml/personel
	@RequestMapping(value = "/personel.xml", method = RequestMethod.GET, produces = "application/xml; charset=UTF-8")
	public PersonelList uretxml2() {
		List<Personel> personeller = personelDAO.list();
		/*
		 * Personel p1 = new Personel("adi1", "soyadi1", "email1"); Personel p2 = new
		 * Personel("adi2", "soyadi2", "email2"); Personel p3 = new Personel("adi3",
		 * "soyadi3", "email3"); personeller.add(p1); personeller.add(p2);
		 * personeller.add(p3);
		 */

		PersonelList personelListesi = new PersonelList();
		personelListesi.getPersonel().addAll(personeller);
		return personelListesi;
	}

//	http://localhost:8080/json/personel
	@RequestMapping(value = "/personel.json", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public List<Personel> uretjsonl2() {
		return personelDAO.list();
	}

//	http://localhost:8080/xml/personel/2
	@RequestMapping(value = "/personel/{id}.xml", method = RequestMethod.GET, produces = "application/xml; charset=UTF-8")
	public Personel uretxml3(@PathVariable("id") int id) {
		return personelDAO.get(id);
	}

//	http://localhost:8080/json/personel/2
	@RequestMapping(value = "/personel/{id}.json", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Personel uretjson3(@PathVariable("id") int id) {
		return personelDAO.get(id);
	}
}