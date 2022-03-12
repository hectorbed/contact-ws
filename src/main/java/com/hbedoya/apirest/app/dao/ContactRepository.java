package com.hbedoya.apirest.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hbedoya.apirest.app.entity.Contact;

// 												<Entity to manage, Primary Key of the entity>
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
