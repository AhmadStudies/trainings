package com.habib.trains;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView hom(Alien alien) throws IOException {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("att", alien);
		 
		 
		 return mv;
		
	}
}
