package br.com.parkinglot.infrastructure.mappers;

import br.com.parkinglot.domain.model.Vehicle;
import br.com.parkinglot.infrastructure.request.CreateVehicleRequest;
import br.com.parkinglot.infrastructure.response.CreateVehicleResponse;

public class VehicleDTOMapper {
	public CreateVehicleResponse toResponse(Vehicle vehicle) {
		return new CreateVehicleResponse(vehicle.getId(), vehicle.getLicensePlate());
	}

	public Vehicle toVehicle(CreateVehicleRequest request) {
		return new Vehicle(request.getLicensePlate());
	}

}
