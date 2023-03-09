package com.spring.ex01;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("mainController")
@RequestMapping("/fdsfwerf")
public class MainController {
	
	@RequestMapping(value = {"/fdasdfwaerfwaf.do", "djkfdsfds.do"} , method = RequestMethod.GET)
	ModelAndView main1(HttpServletRequest request, HttpServletResponse response ) throws Exception{
		ModelAndView mav=new ModelAndView();
		mav.addObject("fsdhj", "hihihi");
		mav.setViewName("fdsjklfsd");
		return mav;
	}
	
	
	@RequestMapping(value = {"/ddd.do", "sss.do"} , method = RequestMethod.GET)
	ModelAndView fdjkllfdsljk(HttpServletRequest request, HttpServletResponse response ) throws Exception{
		ModelAndView mav=new ModelAndView();
		mav.addObject("fsdhj", "hihihi2");
		mav.setViewName("fsds");
		return mav;
	}

}
