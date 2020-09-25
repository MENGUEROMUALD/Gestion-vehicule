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
	@JoinColumn(name = "vehiculetypeid", insertable = false, updatable = false)
	private VehiculeType vehiculeType;
	private Integer vehiculetypeid;
	
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
	
	@ManyToOne
	@JoinColumn(name = "employeid", insertable = false, updatable = false)
	private Employe employe;
	private Integer employeid;
	
	public Vehicule(String name, VehiculeType vehiculeType, Integer vehiculetypeid, String vehiculeNumber,
			Date registrationDate, Date acquisitionDate, String description, VehiculeMake vehiculeMake,
			Integer vehiculemakeid, String power, String fuelCapacity, String remarks, String netWeight,
			VehiculeStatus vehiculeStatus, Integer vehiculestatusid, VehiculeModel vehiculeModel,
			Integer vehiculemodelid, Location location, Integer locationid, Employe employe, Integer employeid) {
		super();
		this.name = name;
		this.vehiculeType = vehiculeType;
		this.vehiculetypeid = vehiculetypeid;
		this.vehiculeNumber = vehiculeNumber;
		this.registrationDate = registrationDate;
		this.acquisitionDate = acquisitionDate;
		this.description = description;
		this.vehiculeMake = vehiculeMake;
		this.vehiculemakeid = vehiculemakeid;
		this.power = power;
		this.fuelCapacity = fuelCapacity;
		this.remarks = remarks;
		this.netWeight = netWeight;
		this.vehiculeStatus = vehiculeStatus;
		this.vehiculestatusid = vehiculestatusid;
		this.vehiculeModel = vehiculeModel;
		this.vehiculemodelid = vehiculemodelid;
		this.location = location;
		this.locationid = locationid;
		this.employe = employe;
		this.employeid = employeid;
	}
	public Vehicule() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public VehiculeType getVehiculeType() {
		return vehiculeType;
	}
	public void setVehiculeType(VehiculeType vehiculeType) {
		this.vehiculeType = vehiculeType;
	}
	public Integer getVehiculetypeid() {
		return vehiculetypeid;
	}
	public void setVehiculetypeid(Integer vehiculetypeid) {
		this.vehiculetypeid = vehiculetypeid;
	}
	public String getVehiculeNumber() {
		return vehiculeNumber;
	}
	public void setVehiculeNumber(String vehiculeNumber) {
		this.vehiculeNumber = vehiculeNumber;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Date getAcquisitionDate() {
		return acquisitionDate;
	}
	public void setAcquisitionDate(Date acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public VehiculeMake getVehiculeMake() {
		return vehiculeMake;
	}
	public void setVehiculeMake(VehiculeMake vehiculeMake) {
		this.vehiculeMake = vehiculeMake;
	}
	public Integer getVehiculemakeid() {
		return vehiculemakeid;
	}
	public void setVehiculemakeid(Integer vehiculemakeid) {
		this.vehiculemakeid = vehiculemakeid;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(String fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getNetWeight() {
		return netWeight;
	}
	public void setNetWeight(String netWeight) {
		this.netWeight = netWeight;
	}
	public VehiculeStatus getVehiculeStatus() {
		return vehiculeStatus;
	}
	public void setVehiculeStatus(VehiculeStatus vehiculeStatus) {
		this.vehiculeStatus = vehiculeStatus;
	}
	public Integer getVehiculestatusid() {
		return vehiculestatusid;
	}
	public void setVehiculestatusid(Integer vehiculestatusid) {
		this.vehiculestatusid = vehiculestatusid;
	}
	public VehiculeModel getVehiculeModel() {
		return vehiculeModel;
	}
	public void setVehiculeModel(VehiculeModel vehiculeModel) {
		this.vehiculeModel = vehiculeModel;
	}
	public Integer getVehiculemodelid() {
		return vehiculemodelid;
	}
	public void setVehiculemodelid(Integer vehiculemodelid) {
		this.vehiculemodelid = vehiculemodelid;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Integer getLocationid() {
		return locationid;
	}
	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Integer getEmployeid() {
		return employeid;
	}
	public void setEmployeid(Integer employeid) {
		this.employeid = employeid;
	}
	
	
}
