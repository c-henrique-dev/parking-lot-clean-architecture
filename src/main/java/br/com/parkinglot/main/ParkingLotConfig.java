package br.com.parkinglot.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.parkinglot.application.gateways.ParkingLotGateway;
import br.com.parkinglot.application.usercases.CreateParkingLotUseCase;
import br.com.parkinglot.infrastructure.gateways.ParkingLotRepositoryGateway;
import br.com.parkinglot.infrastructure.mappers.ParkingLotDTOMapper;
import br.com.parkinglot.infrastructure.mappers.ParkingLotEntityMapper;
import br.com.parkinglot.infrastructure.repositories.ParkingLotRepository;

@Configuration
public class ParkingLotConfig {

	@Bean
	CreateParkingLotUseCase createParkingLot(ParkingLotGateway parkingLotGateway) {
		return new CreateParkingLotUseCase(parkingLotGateway);
	}

	@Bean
	ParkingLotGateway parkingLotGateway(ParkingLotRepository parkingLotRepository, ParkingLotEntityMapper parkingLotEntityMapper) {
		return new ParkingLotRepositoryGateway(parkingLotRepository, parkingLotEntityMapper);
	}

	@Bean
	ParkingLotEntityMapper parkingLotEntityMapper() {
		return new ParkingLotEntityMapper();
	}

	@Bean
	ParkingLotDTOMapper parkingLotDTOMapper() {
		return new ParkingLotDTOMapper();
	}

}
