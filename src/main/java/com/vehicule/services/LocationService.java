package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.Location;
import com.vehicule.repository.LocationRepository;

@Service
public class LocationService {

	@Autowired private LocationRepository repository;
	
	public List<Location> getLocation(){
		return repository.findAll();
	}
	
	public Location saveLocation(Location locate) {
		return repository.save(locate);
	}
	
	public Optional<Location> getById(Integer id){
		return repository.findById(id);
	}

	public void deleteLocation(Integer id) {
		repository.deleteById(id);
	}
}
