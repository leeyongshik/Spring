package main.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Component
public class MainController {
	
	@RequestMapping(value = "/index")
	public String index() {
		return "/index";
	}
}
