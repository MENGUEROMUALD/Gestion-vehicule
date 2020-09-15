package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.Contact;
import com.vehicule.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository repository;
	
	public List<Contact> getContact(){
		return repository.findAll();
	}
	
	public Optional<Contact> getContactById(Integer id){
		return repository.findById(id);
	}
	
	public void saveContact(Contact contact) {
		repository.save(contact);
	}
	
	public void deleteContact(Integer id) {
		repository.deleteById(id);
	}
}
