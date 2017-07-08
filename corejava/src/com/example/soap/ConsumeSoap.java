package com.example.soap;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class ConsumeSoap {

	public static void main(String[] args) {
		GeoIPService ipservice=new GeoIPService();
		GeoIPServiceSoap soap=ipservice.getGeoIPServiceSoap();
		GeoIP geoip=soap.getGeoIP("212.58.246.79");
		System.out.println(geoip.getCountryName());		
	
	}

}
