package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.vehicule.models.Contry;
import com.vehicule.repository.ContryRepository;

@Service
public class ContryService {

	@Autowired
	private ContryRepository contryRepository;
	
	public List<Contry> getContries(){
		return contryRepository.findAll();
	}
	
	public Optional<Contry> getContriesById(Integer id){
		return contryRepository.findById(id);
	}
	
	public void saveContry(Contry contry) {
		contryRepository.save(contry);
	}
	
	public void deleteContry(Integer id) {
		contryRepository.deleteById(id);
	}
}
