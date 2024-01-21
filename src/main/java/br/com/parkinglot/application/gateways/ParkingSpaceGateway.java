package br.com.parkinglot.application.gateways;

import br.com.parkinglot.domain.model.ParkingSpace;

public interface ParkingSpaceGateway {
	ParkingSpace createParkingSpace(ParkingSpace parkingSpace);
}
