package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.vehicule.models.State;
import com.vehicule.repository.StateRepository;

@Service
public class StateService {
	
	@Autowired
	private StateRepository repository;
	
	// getAll State
	public List<State> getStates(){
		return repository.findAll();
	}
	
	public State addState(State state) {
		return repository.save(state);
	}

	public Optional<State> getStateById(Integer id) {
		return repository.findById(id);
	}
	
	public void deleteState(Integer id) {
		repository.deleteById(id);
	}
}
