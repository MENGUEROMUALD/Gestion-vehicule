package com.vehicule.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class VehiculeMovement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date1;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date2;
	private String remarks;
	
	@ManyToOne
	@JoinColumn(name = "locationid1", insertable = false, updatable = false)
	private Location location1;
	private Integer locationid1;
	
	@ManyToOne
	@JoinColumn(name = "locationid1", insertable = false, updatable = false)
	private Location location2;
	private Integer locationid2;
	
	@ManyToOne
	@JoinColumn(name = "vehiculeid",insertable = false, updatable = false)
	private Vehicule vehicule;
	private Integer vehiculeid;
}
