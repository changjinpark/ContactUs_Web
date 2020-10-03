package com.mycompany.contactus.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.contact.vo.Contact;
import com.mycompany.contactus.dao.ContactDao;


@Service("ContactService")
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactDao dao;

	private static final Logger logger = LoggerFactory.getLogger(ContactServiceImpl.class);

	@Override
	public void putcontactus(Contact contact) 
	{ 
		//logger.info를 사용해서 VO 값이 Service 단에 전달되는지 확인
		logger.info("Phone {}.", contact.getPhone());
		
		dao.contactInsert(contact);
		
	 }
	/*
	@Override
    public List<Contact> selectMember() throws Exception {
 
        return dao.selectMember();
    }
	*/
}