package com.example.clone;

import java.io.Serializable;

public class Address implements Serializable {

	private String city;
	private int cityCode;
	
	public Address(String city, int cityCode){
	this.city=city;
	this.cityCode=cityCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCityCode() {
		return cityCode;
	}

	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	@Override
	public String toString(){
		return "Addr:"+this.city+this.cityCode;
	}
	
	
}
