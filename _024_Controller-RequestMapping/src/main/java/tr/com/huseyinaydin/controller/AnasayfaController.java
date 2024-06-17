package tr.com.huseyinaydin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/hastane")
public class AnasayfaController {
	
	//http://localhost:8080/_024_Controller-RequestMapping/hastane/goz
	@RequestMapping(value = "/goz", method = RequestMethod.GET)
	public String AnasayfaView(Model model) {
		model.addAttribute("mesaj1", "SELAM" );
		model.addAttribute("mesaj2", "Goz" );
		model.addAttribute("mesaj3", "MVC" );
		return "AnasayfaView";
	}
	
	//http://localhost:8080/_024_Controller-RequestMapping/hastane/kalp
	@RequestMapping(value = "/kalp", method = RequestMethod.GET)
	public ModelAndView kalp() {
		ModelAndView modelAndView = new ModelAndView("AnasayfaView");
		modelAndView.addObject("mesaj1", "SELAM" );
		modelAndView.addObject("mesaj2", "KALP" );
		modelAndView.addObject("mesaj3", "BOLUMU" );
		return modelAndView;
	}
	
	//http://localhost:8080/_024_Controller-RequestMapping/hastane/mide
	@RequestMapping(value = "/mide", method = RequestMethod.GET)
	public ModelAndView mide() {
		ModelAndView modelAndView = new ModelAndView("AnasayfaView");
		modelAndView.addObject("mesaj1", "SELAM" );
		modelAndView.addObject("mesaj2", "mide" );
		modelAndView.addObject("mesaj3", "BOLUMU" );
		return modelAndView;
	}
	
	//http://localhost:8080/_024_Controller-RequestMapping/hastane/beyin/tomgrafi
	@RequestMapping(value = "/beyin/tomgrafi", method = RequestMethod.GET)
	public ModelAndView beyin() {
		ModelAndView modelAndView = new ModelAndView("AnasayfaView");
		modelAndView.addObject("mesaj1", "SELAM" );
		modelAndView.addObject("mesaj2", "beyin" );
		modelAndView.addObject("mesaj3", "BOLUMU" );
		return modelAndView;
	}
}