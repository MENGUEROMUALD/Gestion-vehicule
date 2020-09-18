package com.vehicule.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String address;
	private String phone;
	private String mobile;
	private String website;
	private String email;
	private String details;
	private String city;
	
	
	
	public Client() {
		super();
	}
	public Client(String name, String address, String phone, String mobile, String website, String email,
			String details, Contry contry, Integer contryid, State state, Integer stateid,String city) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
		this.website = website;
		this.email = email;
		this.details = details;
		this.contry = contry;
		this.contryid = contryid;
		this.state = state;
		this.stateid = stateid;
		this.city = city;
	}
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Contry getContry() {
		return contry;
	}
	public void setContry(Contry contry) {
		this.contry = contry;
	}
	public Integer getContryid() {
		return contryid;
	}
	public void setContryid(Integer contryid) {
		this.contryid = contryid;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Integer getStateid() {
		return stateid;
	}
	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}



	@ManyToOne
	@JoinColumn(name = "contryid",insertable = false, updatable = false)
	private Contry contry;
	private Integer contryid;
	
	@ManyToOne
	@JoinColumn(name = "stateid",insertable = false, updatable = false)
	private State state;
	private Integer stateid;
}
