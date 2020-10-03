package com.mycompany.contactus;

import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.contact.vo.Contact;
import com.mycompany.contactus.service.ContactService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	ContactService service;

	@RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
	public String home(Locale locale, Model model, @ModelAttribute Contact contact) throws Exception {
		
		//logger.info를 사용해서 VO 값이 controller 단에 전달되는지 확인
		logger.info("issue Type {}.", contact.getIssueType());
		
		service.putcontactus(contact);
		
		//List<Contact> memberList = service.selectMember();       
        //model.addAttribute("memberList", memberList);

		return "home";
	}	
}