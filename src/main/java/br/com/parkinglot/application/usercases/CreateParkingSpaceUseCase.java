package br.com.parkinglot.application.usercases;

import br.com.parkinglot.application.gateways.ParkingSpaceGateway;
import br.com.parkinglot.domain.model.ParkingSpace;

public class CreateParkingSpaceUseCase {

	private final ParkingSpaceGateway parkingSpaceGateway;

	public CreateParkingSpaceUseCase(ParkingSpaceGateway parkingSpaceGateway) {
		this.parkingSpaceGateway = parkingSpaceGateway;
	}

	public ParkingSpace execute(ParkingSpace parkingSpace) {
		return this.parkingSpaceGateway.createParkingSpace(parkingSpace);
	}

}
