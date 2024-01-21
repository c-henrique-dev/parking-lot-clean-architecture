package br.com.parkinglot.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.parkinglot.application.usercases.CreateVehicleUseCase;
import br.com.parkinglot.domain.model.Vehicle;
import br.com.parkinglot.infrastructure.mappers.VehicleDTOMapper;
import br.com.parkinglot.infrastructure.request.CreateVehicleRequest;
import br.com.parkinglot.infrastructure.response.CreateVehicleResponse;

@RestController
@RequestMapping("vehicle")
public class VehicleController {

	private final CreateVehicleUseCase createVehicleUseCase;
	private final VehicleDTOMapper vehicleDTOMapper;

	public VehicleController(CreateVehicleUseCase createVehicleUseCase, VehicleDTOMapper vehicleDTOMapper) {
		this.createVehicleUseCase = createVehicleUseCase;
		this.vehicleDTOMapper = vehicleDTOMapper;
	}
	
	@PostMapping
	public CreateVehicleResponse createVehicle(@RequestBody CreateVehicleRequest request) {
		Vehicle vehicleLotBusinessObj = vehicleDTOMapper.toVehicle(request);
		Vehicle vehicle = createVehicleUseCase.execute(vehicleLotBusinessObj);
		return vehicleDTOMapper.toResponse(vehicle);
	}

}
