package com.techelevator.city;

public class City {
	private Long id;
	private String name;
	private String countryCode;
	private String district;
	private int population;

	public City() {
		
	}
	
	public City(String n, String cc, String d, int p) {
		name = n;
		countryCode = cc;
		district = d;
		population = p; 
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
}
