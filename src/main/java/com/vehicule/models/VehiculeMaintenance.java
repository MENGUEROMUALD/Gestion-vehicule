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
public class VehiculeMaintenance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String remarks;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "vehiculeid", insertable = false, updatable = false)
	private Vehicule vehicule;
	private Integer vehiculeid;
	
	@ManyToOne
	@JoinColumn(name = "supplierid", insertable = false, updatable = false)
	private Supplier supplier;
	private Integer supplierid;
	public VehiculeMaintenance(String remarks, Date startDate, Date endDate, Double price, Vehicule vehicule,
			Integer vehiculeid, Supplier supplier, Integer supplierid) {
		super();
		this.remarks = remarks;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
		this.vehicule = vehicule;
		this.vehiculeid = vehiculeid;
		this.supplier = supplier;
		this.supplierid = supplierid;
	}
	public VehiculeMaintenance() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
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
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Integer getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}
	
	
}
