package br.com.parkinglot.infrastructure.request;

public class CreateVehicleRequest {
	private String licensePlate;

	public CreateVehicleRequest() {

	}

	public CreateVehicleRequest(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

}
