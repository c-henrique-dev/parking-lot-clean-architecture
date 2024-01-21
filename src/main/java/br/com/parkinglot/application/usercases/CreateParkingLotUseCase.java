package br.com.parkinglot.application.usercases;

import br.com.parkinglot.application.gateways.ParkingLotGateway;
import br.com.parkinglot.domain.model.ParkingLot;

public class CreateParkingLotUseCase {

	private final ParkingLotGateway parkingLotGateway;

	public CreateParkingLotUseCase(ParkingLotGateway userGateway) {
		this.parkingLotGateway = userGateway;
	}

	public ParkingLot execute(ParkingLot parkingLot) {
		return parkingLotGateway.createParkingLot(parkingLot);
	}
}
