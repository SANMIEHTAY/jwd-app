package ai.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategorityController {
	@GetMapping("/categories")
	public String home() {
		return "home";
	}
}
