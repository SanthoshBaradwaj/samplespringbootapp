package com.verizon.adb.service;

import java.util.List;

import com.verizon.adb.model.Contact;

public interface ContactService {

	Contact getContactById(long contactId);

	List<Contact> getAllContacts();

	Contact addContacts(Contact contact);

	Contact updateContact(Contact contact);

	boolean deleteContact(long contactId);

	boolean existsByMobileNumber(String mobileNumber);

	boolean existsByEmailId(String emailId);

	Contact findByMobileNumber(String mobileNumber);

	Contact findByEmailId(String emailId);

	List<Contact> findAllByLastName(String lastName);

}
