package br.com.parkinglot.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.parkinglot.application.usercases.CreateParkingLotUseCase;
import br.com.parkinglot.domain.model.ParkingLot;
import br.com.parkinglot.infrastructure.mappers.ParkingLotDTOMapper;
import br.com.parkinglot.infrastructure.request.CreateParkingLotRequest;
import br.com.parkinglot.infrastructure.response.CreateParkingLotResponse;

@RestController
@RequestMapping("parkingLot")
public class ParkingLotController {

	private final CreateParkingLotUseCase createParkingLot;
	private final ParkingLotDTOMapper parkingLotDTOMapper;

	public ParkingLotController(CreateParkingLotUseCase createParkingLot, ParkingLotDTOMapper parkingLotDTOMapper) {
		this.createParkingLot = createParkingLot;
		this.parkingLotDTOMapper = parkingLotDTOMapper;
	}

	@PostMapping
	public CreateParkingLotResponse createParkingLot(@RequestBody CreateParkingLotRequest request) {
		ParkingLot parkingLotBusinessObj = parkingLotDTOMapper.toParkingLot(request);
		ParkingLot parkingLot = createParkingLot.execute(parkingLotBusinessObj);
		return parkingLotDTOMapper.toResponse(parkingLot);
	}

}
