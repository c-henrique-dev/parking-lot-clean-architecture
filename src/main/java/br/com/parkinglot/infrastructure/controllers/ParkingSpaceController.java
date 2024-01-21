package br.com.parkinglot.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.parkinglot.application.usercases.CreateParkingSpaceUseCase;
import br.com.parkinglot.domain.model.ParkingSpace;
import br.com.parkinglot.infrastructure.mappers.ParkingSpaceDTOMapper;
import br.com.parkinglot.infrastructure.request.CreateParkingSpaceRequest;
import br.com.parkinglot.infrastructure.response.CreateParkingSpaceResponse;

@RestController
@RequestMapping("parkingSpace")
public class ParkingSpaceController {

	private final CreateParkingSpaceUseCase createParkingSpaceUseCase;
	private final ParkingSpaceDTOMapper parkingSpaceDTOMapper;

	public ParkingSpaceController(CreateParkingSpaceUseCase createParkingSpace,
			ParkingSpaceDTOMapper parkingSpaceDTOMapper) {
		this.createParkingSpaceUseCase = createParkingSpace;
		this.parkingSpaceDTOMapper = parkingSpaceDTOMapper;
	}

	@PostMapping
	public CreateParkingSpaceResponse createParkingSpace(@RequestBody CreateParkingSpaceRequest request) {
		ParkingSpace parkingSpaceBusinessObj = parkingSpaceDTOMapper.toParkingSpace(request);
		ParkingSpace parkingSpace = createParkingSpaceUseCase.execute(parkingSpaceBusinessObj);
		return parkingSpaceDTOMapper.toResponse(parkingSpace);
	}

}
