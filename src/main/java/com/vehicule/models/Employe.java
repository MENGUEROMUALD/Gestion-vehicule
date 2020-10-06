package com.vehicule.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Employe extends Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String photo;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date datehire;
	
	@ManyToOne
	@JoinColumn(name = "employetypeid", insertable = false, updatable = false)
	private EmployeType employeType;
	private Integer employetypeid;
	
	@ManyToOne
	@JoinColumn(name = "jobtitleid", insertable = false, updatable = false)
	private JobTitle jobTitle;
	private String jobtitleid;
	public Employe(String username, String photo, Date datehire, EmployeType employeType, Integer employetypeid,
			JobTitle jobTitle, String jobtitleid) {
		super();
		this.username = username;
		this.photo = photo;
		this.datehire = datehire;
		this.employeType = employeType;
		this.employetypeid = employetypeid;
		this.jobTitle = jobTitle;
		this.jobtitleid = jobtitleid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getDatehire() {
		return datehire;
	}
	public void setDatehire(Date datehire) {
		this.datehire = datehire;
	}
	public EmployeType getEmployeType() {
		return employeType;
	}
	public void setEmployeType(EmployeType employeType) {
		this.employeType = employeType;
	}
	public Integer getEmployetypeid() {
		return employetypeid;
	}
	public void setEmployetypeid(Integer employetypeid) {
		this.employetypeid = employetypeid;
	}
	public JobTitle getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobtitleid() {
		return jobtitleid;
	}
	public void setJobtitleid(String jobtitleid) {
		this.jobtitleid = jobtitleid;
	}
	
	
	
}
