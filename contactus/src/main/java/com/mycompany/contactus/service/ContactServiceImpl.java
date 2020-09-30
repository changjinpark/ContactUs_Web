package com.mycompany.contactus.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.contactus.dao.ContactDao;


@Service("ContactService")
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactDao dao;

	private static final Logger logger = LoggerFactory.getLogger(ContactServiceImpl.class);

	@Override
	public void putcontactus(String fullName, String Email, String Phone, String Subject, String Message) 
	{ 
		logger.info("test");
		logger.info("Phone {}.", Phone);
		
		dao.contactInsert(fullName, Email, Phone, Subject, Message);
		
	 }

}