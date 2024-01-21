package br.com.parkinglot.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.parkinglot.application.gateways.ParkingSpaceGateway;
import br.com.parkinglot.application.usercases.CreateParkingSpaceUseCase;
import br.com.parkinglot.infrastructure.gateways.ParkingSpaceRepositoryGateway;
import br.com.parkinglot.infrastructure.mappers.ParkingSpaceDTOMapper;
import br.com.parkinglot.infrastructure.mappers.ParkingSpacetEntityMapper;
import br.com.parkinglot.infrastructure.repositories.ParkingLotRepository;
import br.com.parkinglot.infrastructure.repositories.ParkingSpaceRepository;
import br.com.parkinglot.infrastructure.repositories.VehicleRepository;

@Configuration
public class ParkingSpaceConfig {

	@Bean
	CreateParkingSpaceUseCase createParkingSpace(ParkingSpaceGateway parkingSpaceGateway) {
		return new CreateParkingSpaceUseCase(parkingSpaceGateway);
	}

	@Bean
	ParkingSpaceGateway parkingSpaceGateway(ParkingSpaceRepository parkingSpaceRepository,
			ParkingSpacetEntityMapper parkingSpaceEntityMapper, VehicleRepository vehicleRepository,
			ParkingLotRepository parkingLotRepository) {
		return new ParkingSpaceRepositoryGateway(parkingSpaceRepository, parkingSpaceEntityMapper, vehicleRepository,
				parkingLotRepository);
	}

	@Bean
	ParkingSpacetEntityMapper parkingSpaceEntityMapper() {
		return new ParkingSpacetEntityMapper();
	}

	@Bean
	ParkingSpaceDTOMapper parkingSpaceDTOMapper() {
		return new ParkingSpaceDTOMapper();
	}

}
