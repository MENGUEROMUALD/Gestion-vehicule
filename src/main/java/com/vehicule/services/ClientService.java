package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.vehicule.models.Client;
import com.vehicule.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	// lister tous les clients
	public List<Client> getClient(){
		return repository.findAll();
	}
	
	// lister un client
	public Optional<Client> getClientById(Integer id){
		return repository.findById(id);
	}
	
	// sauvegarder le client en base
	public void saveClient(Client client) {
		repository.save(client);
	}
	
	// supprimer un client
	public void deleteClient(Integer id) {
		repository.deleteById(id);
	}
}
