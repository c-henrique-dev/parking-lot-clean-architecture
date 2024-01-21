package br.com.parkinglot.domain.model;

public class Vehicle {

	private Long id;
	private String licensePlate;

	public Vehicle() {

	}

	public Vehicle(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Vehicle(Long id, String licensePlate) {
		this.id = id;
		this.licensePlate = licensePlate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

}
