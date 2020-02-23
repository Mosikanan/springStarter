package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

	@RequestMapping("home")
	public ModelAndView home(Alien ali) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",ali);
		mv.setViewName("homeee");
		return mv;

		
		
		
//		ModelAndView mv = new ModelAndView();
//
//		mv.addObject("nameInView", nam);
//		mv.setViewName("homeee");
////
////		System.out.print("hiiii" + nam);
////		session.setAttribute("nam", nam);
//		return mv;

	}

}
