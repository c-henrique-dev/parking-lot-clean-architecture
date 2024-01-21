package br.com.parkinglot.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.parkinglot.application.gateways.VehicleGateway;
import br.com.parkinglot.application.usercases.CreateVehicleUseCase;
import br.com.parkinglot.infrastructure.gateways.VehicleRepositoryGateway;
import br.com.parkinglot.infrastructure.mappers.VehicleDTOMapper;
import br.com.parkinglot.infrastructure.mappers.VehicleEntityMapper;
import br.com.parkinglot.infrastructure.repositories.VehicleRepository;

@Configuration
public class VehicleConfig {
	
	@Bean
	CreateVehicleUseCase createVehicle(VehicleGateway vehicleGateway) {
		return new CreateVehicleUseCase(vehicleGateway);
	}

	@Bean
	VehicleGateway vehicleGateway(VehicleRepository vehicleRepository, VehicleEntityMapper vehicleEntityMapper) {
		return new VehicleRepositoryGateway(vehicleEntityMapper, vehicleRepository);
	}

	@Bean
	VehicleEntityMapper vehicleEntityMapper() {
		return new VehicleEntityMapper();
	}

	@Bean
	VehicleDTOMapper vehicleDTOMapper() {
		return new VehicleDTOMapper();
	}

}
