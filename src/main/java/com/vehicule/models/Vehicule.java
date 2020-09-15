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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Vehicule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "vehiculeid", insertable = false, updatable = false)
	private VehiculeType vehiculeType;
	private Integer vehiculeid;
	
	private String vehiculeNumber;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date registrationDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date acquisitionDate;
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "vehiculemakeid", insertable = false, updatable = false)
	private VehiculeMake vehiculeMake;
	private Integer vehiculemakeid;
	
	private String power;
	private String fuelCapacity;
	private String remarks;
	private String netWeight;
	
	@ManyToOne
	@JoinColumn(name = "vehiculestatusid", insertable = false, updatable = false)
	private VehiculeStatus vehiculeStatus;
	private Integer vehiculestatusid;
	
	@ManyToOne
	@JoinColumn(name = "vehiculemodelid", insertable = false, updatable = false)
	private VehiculeModel vehiculeModel;
	private Integer vehiculemodelid;
	
	@ManyToOne
	@JoinColumn(name = "locationid", insertable = false, updatable = false)
	private Location location;
	private Integer locationid;
}
