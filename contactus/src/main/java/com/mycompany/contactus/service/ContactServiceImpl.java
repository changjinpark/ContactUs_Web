package com.mycompany.contactus.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service("ContactService")
public class ContactServiceImpl implements ContactService {


	private static final Logger logger = LoggerFactory.getLogger(ContactServiceImpl.class);

	@Override
	public void putcontactus(String fullName, String Email, String Phone, String Subject, String Message) 
	{ 
		logger.info("test");
		logger.info("fullName {}.", fullName);
	 }

}