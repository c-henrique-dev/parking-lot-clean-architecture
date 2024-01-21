package br.com.parkinglot.infrastructure.response;

public class CreateVehicleResponse {
	private Long id;
	private String licensePlate;

	public CreateVehicleResponse(Long id, String licensePlate) {
		super();
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
