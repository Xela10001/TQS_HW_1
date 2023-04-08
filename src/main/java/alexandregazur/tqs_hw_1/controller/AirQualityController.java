package alexandregazur.tqs_hw_1.controller;

import alexandregazur.tqs_hw_1.model.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AirQualityController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
	
	@GetMapping("/air-quality")
	public String showAirQuality(/*Model model*/) {
		//model.addAttribute("book", new Book());
		return "air-quality";
	}
	
	@PostMapping("/")
	public String addBasdsaook(@ModelAttribute("book") Request book, Model model) {
		//model.addAttribute("book", new Book());
		
		//bookRepository.save(book);
		//model.addAttribute("books", bookRepository.findAll());
		return "redirect:/air-quality";
	}
	
}
