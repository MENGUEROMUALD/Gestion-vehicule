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
	public VehiculeMovement(Date date1, Date date2, String remarks, Location location1, Integer locationid1,
			Location location2, Integer locationid2, Vehicule vehicule, Integer vehiculeid) {
		super();
		this.date1 = date1;
		this.date2 = date2;
		this.remarks = remarks;
		this.location1 = location1;
		this.locationid1 = locationid1;
		this.location2 = location2;
		this.locationid2 = locationid2;
		this.vehicule = vehicule;
		this.vehiculeid = vehiculeid;
	}
	public VehiculeMovement() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public Date getDate2() {
		return date2;
	}
	public void setDate2(Date date2) {
		this.date2 = date2;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Location getLocation1() {
		return location1;
	}
	public void setLocation1(Location location1) {
		this.location1 = location1;
	}
	public Integer getLocationid1() {
		return locationid1;
	}
	public void setLocationid1(Integer locationid1) {
		this.locationid1 = locationid1;
	}
	public Location getLocation2() {
		return location2;
	}
	public void setLocation2(Location location2) {
		this.location2 = location2;
	}
	public Integer getLocationid2() {
		return locationid2;
	}
	public void setLocationid2(Integer locationid2) {
		this.locationid2 = locationid2;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public Integer getVehiculeid() {
		return vehiculeid;
	}
	public void setVehiculeid(Integer vehiculeid) {
		this.vehiculeid = vehiculeid;
	}
	
	
}
