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
	
}
