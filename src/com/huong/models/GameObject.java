package com.huong.models;

public class GameObject {
	protected String name;
	protected Location location;
	public GameObject(){
		
	}
	public GameObject(String name, Location location) {
		super();
		this.name = name;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	

}
