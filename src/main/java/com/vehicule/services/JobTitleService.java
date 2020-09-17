package com.vehicule.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicule.models.JobTitle;
import com.vehicule.repository.JobTitleRepository;

@Service
public class JobTitleService {
	@Autowired private JobTitleRepository jtr;
	
	public List<JobTitle> listJobTitle(){
		return jtr.findAll();
	}
	
	public Optional<JobTitle> JobTitleById(Integer id){
		return jtr.findById(id);
	}
	
	public void saveJobTitle(JobTitle is) {
		jtr.save(is);
	}
	
	public void deleteJobTitle(Integer id) {
		jtr.deleteById(id);
	}
}
