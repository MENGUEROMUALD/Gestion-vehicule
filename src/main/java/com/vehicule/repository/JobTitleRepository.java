package com.vehicule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicule.models.JobTitle;

public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
