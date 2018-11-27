package com.mk.KothaliArmyFoundationController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mk.KothaliArmyFoundationBO.HomeBO;
import com.mk.KothaliArmyFoundationServices.HomeService;

@Controller
public class HomeController {
	@Autowired
	public HomeService homeService;
	
	@RequestMapping("/kothalihomepage.html")
	public ModelAndView getHomePage() {
		ModelAndView mav=new ModelAndView("KothaliArmyFoundationHomePage");
		List<HomeBO> list=homeService.getKothaliFoundationDetails();
		return mav;
		
	}
	
	

}
