package br.com.parkinglot.infrastructure.mappers;

import br.com.parkinglot.domain.model.ParkingLot;
import br.com.parkinglot.domain.model.ParkingSpace;
import br.com.parkinglot.domain.model.Vehicle;
import br.com.parkinglot.infrastructure.request.CreateParkingSpaceRequest;
import br.com.parkinglot.infrastructure.response.CreateParkingSpaceResponse;

public class ParkingSpaceDTOMapper {
	public CreateParkingSpaceResponse toResponse(ParkingSpace parkingSpace) {
		return new CreateParkingSpaceResponse(parkingSpace.getId(), parkingSpace.getNumber(),
				parkingSpace.getParkingLot(), parkingSpace.getOccupiedVehicle());
	}

	public ParkingSpace toParkingSpace(CreateParkingSpaceRequest request) {
		Vehicle vehicle = new Vehicle();
		vehicle.setId(request.getOccupiedVehicle());

		ParkingLot parkingLot = new ParkingLot();
		parkingLot.setId(request.getParkingLot());

		return new ParkingSpace(request.getNumber(), parkingLot, vehicle);
	}

}
