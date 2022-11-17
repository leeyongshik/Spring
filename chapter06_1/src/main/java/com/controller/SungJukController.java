package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.SungJukDTO;

@Controller
public class SungJukController {

	@RequestMapping(value = "sungJuk/input.do", method = RequestMethod.GET,produces = "text/html; charset=UTF-8")
	public String input() {
		return "/sungJuk/input";
	}
	
	@PostMapping(value="sungJuk/result.do",produces = "text/html; charset=UTF-8")
	public String result(@ModelAttribute SungJukDTO sungJukDTO, Model model) {
		model.addAttribute("name",sungJukDTO.getName());
		model.addAttribute("kor",sungJukDTO.getKor());
		model.addAttribute("math",sungJukDTO.getMath());
		model.addAttribute("eng",sungJukDTO.getEng());
		model.addAttribute("tot",sungJukDTO.getTot());
		model.addAttribute("avg",sungJukDTO.getAvg());
		
		return "sungJuk/result";
	}
}
