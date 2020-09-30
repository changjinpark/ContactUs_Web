package com.mycompany.contactus.dao;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDaoImpl implements ContactDao {

	private static final Logger logger = LoggerFactory.getLogger(ContactDaoImpl.class);
		
	@Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.example.mapper.contactMapper";
	
	@Override
	public void contactInsert(String fullName, String Email, String Phone, String Subject, String Message) {

    	
		logger.info("Email {}.", Email);

		if(fullName != null && Email != null && Phone != null && Subject != null && Message != null) {
		Map<String, Object> param = new HashMap<>(); 
		param.put("fullName", fullName); 
		param.put("Email", Email);
		param.put("Phone", Phone);
		param.put("Subject", Subject);
		param.put("Message", Message);
		
		sqlSession.insert(Namespace+".insertContactData", param);
		}
	}	
	/*
	@Override
    public List<Contact> selectMember() throws Exception {
 
        return sqlSession.selectList(Namespace+".selectMember");
    }
	*/
}
