package com.mycompany.contactus;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
	public String home(Locale locale, Model model, String fullName, 
			String Email, String Phone, String Subject, String Message) {
		
		//logger.info를 사용해서 controller 단에 데이터가 전달되는지 확인
		logger.info("fullName {}.", fullName);
		logger.info("Email {}.", Email);
		logger.info("Phone {}.", Phone);
		logger.info("Subject {}.", Subject);
		logger.info("Message {}.", Message);

		
		return "home";
	}	
}