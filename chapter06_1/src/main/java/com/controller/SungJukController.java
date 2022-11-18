package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.SungJukDTO;

//@Controller
@RequestMapping(value = "/sungJuk")
public class SungJukController {

	@RequestMapping(value = "/input.do", method = RequestMethod.GET,produces = "text/html; charset=UTF-8")
	public String input() {
		return "/sungJuk/input";
	}
	
	@PostMapping(value="/result.do")
	public String result(@ModelAttribute SungJukDTO sungJukDTO, Model model) {
		
		int tot = sungJukDTO.getKor() + sungJukDTO.getEng() + sungJukDTO.getMath();
		double avg = tot/3.0;
		
		sungJukDTO.setTot(tot);
		sungJukDTO.setAvg(avg);
		System.out.println(tot);
		
		model.addAttribute("sungJukDTO",sungJukDTO);
		
		return "/sungJuk/result";
	}
}
