package br.com.parkinglot.application.usercases;

import br.com.parkinglot.application.gateways.VehicleGateway;
import br.com.parkinglot.domain.model.Vehicle;

public class CreateVehicleUseCase {

	private final VehicleGateway vehicleGateway;

	public CreateVehicleUseCase(VehicleGateway vehicleGateway) {
		this.vehicleGateway = vehicleGateway;
	}

	public Vehicle execute(Vehicle vehicle) {
		return this.vehicleGateway.createVehicle(vehicle);
	}

}
