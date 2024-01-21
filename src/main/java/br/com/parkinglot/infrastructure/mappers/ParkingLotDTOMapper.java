package br.com.parkinglot.infrastructure.mappers;

import br.com.parkinglot.domain.model.ParkingLot;
import br.com.parkinglot.infrastructure.request.CreateParkingLotRequest;
import br.com.parkinglot.infrastructure.response.CreateParkingLotResponse;

public class ParkingLotDTOMapper {
	public CreateParkingLotResponse toResponse(ParkingLot parkingLot) {
		return new CreateParkingLotResponse(parkingLot.getId(), parkingLot.getCapacity());
	}

	public ParkingLot toParkingLot(CreateParkingLotRequest request) {
		return new ParkingLot(request.getCapacity());
	}

}
