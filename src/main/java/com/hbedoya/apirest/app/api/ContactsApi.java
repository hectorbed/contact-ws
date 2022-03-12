package com.hbedoya.apirest.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hbedoya.apirest.app.entity.Contact;
import com.hbedoya.apirest.app.service.ContactService;

@RestController
public class ContactsApi {
	
	@Autowired
	private ContactService service;

	@PostMapping("/product")
	public Contact getById(@RequestBody Contact contact){
        return service.contactSave(contact);
    }
	
}
