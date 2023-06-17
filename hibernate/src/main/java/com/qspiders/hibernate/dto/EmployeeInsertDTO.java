package com.qspiders.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emp")
public class EmployeeInsertDTO {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "empno")
	private int id;
	@Column(name = "ename")
	private String name;
	@Column(name = "job")
	private String designation;
	@Column(name = "sallary")
	private int salary;

}
