package com.mycompany.contactus.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDaoImpl implements ContactDao {

	private static final Logger logger = LoggerFactory.getLogger(ContactDaoImpl.class);
	
	@Override
	public void contactInsert(String fullName, String Email, String Phone, String Subject, String Message) {

		logger.info("Email {}.", Email);
		
		}
	
}
