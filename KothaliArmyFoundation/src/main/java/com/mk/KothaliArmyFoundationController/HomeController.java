package com.mk.KothaliArmyFoundationController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/Kothali")
public class HomeController {
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView getHomePage(HttpServletRequest request) {
		ModelAndView mav=new ModelAndView("KothaliHomePage");
		return mav;
		
	}
	
	

}
