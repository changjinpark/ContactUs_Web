package com.mycompany.contactus.dao;

public interface ContactDao {

	void contactInsert(String fullName, String Email, String Phone, String Subject, String Message);
	
}
