package org.turkeyjug.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.turkeyjug.dao.PersonelDAO;
import org.turkeyjug.model.Personel;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Spring Web MVC ve JPA Hibernate
 *
 */

@Controller
public class PersonelController {

	@Autowired
	private PersonelDAO personelDAO;

//	http://localhost:8080
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView anasayfa() throws Exception {
		List<Personel> personelListe = personelDAO.list();
		ModelAndView model = new ModelAndView("PersonelListesi");
		model.addObject("personelListe", personelListe);
		return model;
	}

//	http://localhost:8080/ekle
	@RequestMapping(value = "/ekle", method = RequestMethod.GET)
	public ModelAndView personelEkle() {
		ModelAndView model = new ModelAndView("PersonelForm");
		model.addObject("personel", new Personel());
		return model;
	}

//	http://localhost:8080/guncelleme
	@RequestMapping(value = "/guncelleme", method = RequestMethod.GET)
	public ModelAndView personelGunceleme(HttpServletRequest request) {
		int personelId = Integer.parseInt(request.getParameter("id"));
		Personel personel = personelDAO.get(personelId);

		ModelAndView model = new ModelAndView("PersonelForm");
		model.addObject("personel", personel);
		return model;
	}

//	http://localhost:8080/kaydet
	@RequestMapping(value = "/kaydet", method = RequestMethod.POST)
	public ModelAndView personelKaydet(@ModelAttribute Personel personel) {
		personelDAO.saveOrUpdate(personel);
		return new ModelAndView("redirect:/");
	}

//	http://localhost:8080/silme
	@RequestMapping(value = "/silme", method = RequestMethod.GET)
	public ModelAndView personelSilme(HttpServletRequest request) {
		int personelId = Integer.parseInt(request.getParameter("id"));
		personelDAO.delete(personelId);
		return new ModelAndView("redirect:/");
	}
}