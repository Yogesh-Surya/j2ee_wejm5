package com.jspiders.springcore.bean;

import lombok.Data;

@Data
public class PersonBean {
	int id;
	String name;
	String email;
	long contact;
	AadharBean aadhar;

}
