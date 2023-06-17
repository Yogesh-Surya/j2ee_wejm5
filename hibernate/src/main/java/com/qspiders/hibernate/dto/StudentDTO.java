package com.qspiders.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentDTO {
	@Id
	private int id;
	private String sname;
	private String semail;
	private int smarks;
	private String saddress;

}
