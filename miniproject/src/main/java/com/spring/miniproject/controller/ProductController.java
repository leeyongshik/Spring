package com.spring.miniproject.controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Controller
public class ProductController {
	
	@GetMapping(value = "/product/productWriteForm")
	public String productWriteForm() {
		return "/product/productWriteForm";
	}

}
