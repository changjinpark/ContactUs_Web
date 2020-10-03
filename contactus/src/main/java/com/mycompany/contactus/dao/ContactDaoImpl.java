package com.mycompany.contactus.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.contact.vo.Contact;

@Repository
public class ContactDaoImpl implements ContactDao {

	private static final Logger logger = LoggerFactory.getLogger(ContactDaoImpl.class);
		
	@Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.example.mapper.contactMapper";
	
	@Override
	public void contactInsert(Contact contact) {

		//logger.info를 사용해서 VO를 이용한 값이 DAO에 전달되는지 확인
		logger.info("Email {}.", contact.getEmail());

		if(contact.getfullName() != null && contact.getEmail() != null && contact.getPhone() != null && contact.getSubject() != null && contact.getMessage() != null) {
		
		sqlSession.insert(Namespace+".insertContactData", contact);
		
		}
	}	
	/*
	@Override
    public List<Contact> selectMember() throws Exception {
 
        return sqlSession.selectList(Namespace+".selectMember");
    }
	*/
}
