package com.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.SumDTO;

@Controller
public class SumController {
	@RequestMapping(value = "/input.do", method = RequestMethod.GET)
	public String input() {
		return "/sum/input";
	}
	
//	@GetMapping("/result.do")
//	public ModelAndView result(@RequestParam int x, @RequestParam int y) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("x",x);
//		mav.addObject("y",y);
//		
//		mav.setViewName("/sum/result");
//		
//		return mav;
//	}
//	@GetMapping("/result.do")
//	public ModelAndView result(@RequestParam(required = false, defaultValue = "0") String x, @RequestParam String y) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("x",x);
//		mav.addObject("y",y);
//		
//		mav.setViewName("/sum/result");
//		
//		return mav;
//	}
	
	@GetMapping("/result.do")
	public String result(@RequestParam(required = false, defaultValue = "0") Map<String, String> map, ModelMap modelMap) {
		
		modelMap.put("x", map.get("x"));
		modelMap.put("y", map.get("y"));
		
		return "/sum/result";
	}
	
	@PostMapping("/result2.do")
	public String result2(@ModelAttribute SumDTO sumDTO, Model model) {
		model.addAttribute("x",sumDTO.getX());
		model.addAttribute("y",sumDTO.getY());
		
		
		return "sum/result2";
	}
	
//	@RequestMapping(value = "/result.do", method = RequestMethod.GET)
//	public ModelAndView result(Map<String, Integer> map) {
//		int x = map.get("x");
//		int y = map.get("y");
//		
//		ModelAndView mav = new ModelAndView();
//		
////		mav.addObject("result", x+"+"+y+"="+(x+y));
//		mav.setViewName("WEB-INF/sum/result");
//		return mav;
//	}

}
