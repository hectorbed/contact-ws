package com.hbedoya.apirest.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbedoya.apirest.app.dao.ContactRepository;
import com.hbedoya.apirest.app.entity.Contact;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository repository;

	public Contact contactSave(Contact contact) {
		return repository.save(contact);
	}
}
