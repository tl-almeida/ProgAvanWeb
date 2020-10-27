package br.com.javancado.usdtobrl.controller;

import br.com.javancado.usdtobrl.dao.CurrencyDAO;
import br.com.javancado.usdtobrl.model.CurrencyConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CurrencyController {
	
	@Autowired
	private CurrencyDAO currencyDAO;
	
	public CurrencyController() {
		currencyDAO = new CurrencyDAO();

	}

	@GetMapping("/")
	  public String greetingForm(Model model) {
	    model.addAttribute("usdtobrl", new CurrencyConverter());

	    return "converter";
	  }
	
	 @PostMapping("/")
	  public String greetingSubmit(@ModelAttribute CurrencyConverter currency, Model model) {
	    model.addAttribute("usdtobrl", currency);
	    model.addAttribute("converted", currencyDAO.converter(currency));

	    return "converted";
	  }
}
