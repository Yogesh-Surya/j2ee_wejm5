package com.jspider.serializationdeserialization;

public class user {
	
	private int id ;
	private String name;
	private String  userId;
	private String  password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString()
	{
		return "user[id="+id+",name="+name+",userIs="+userId+",password="+password+"]";
	}
	

}
