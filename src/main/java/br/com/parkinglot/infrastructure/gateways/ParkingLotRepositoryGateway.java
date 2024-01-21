package br.com.parkinglot.infrastructure.gateways;

import br.com.parkinglot.application.gateways.ParkingLotGateway;
import br.com.parkinglot.domain.model.ParkingLot;
import br.com.parkinglot.infrastructure.entity.ParkingLotEntity;
import br.com.parkinglot.infrastructure.mappers.ParkingLotEntityMapper;
import br.com.parkinglot.infrastructure.repositories.ParkingLotRepository;

public class ParkingLotRepositoryGateway implements ParkingLotGateway {

	private final ParkingLotRepository parkingLotRepository;
	private final ParkingLotEntityMapper parkingLotEntityMapper;

	public ParkingLotRepositoryGateway(ParkingLotRepository parkingLotRepository,
			ParkingLotEntityMapper parkingLotEntityMapper) {
		this.parkingLotRepository = parkingLotRepository;
		this.parkingLotEntityMapper = parkingLotEntityMapper;
	}

	@Override
	public ParkingLot createParkingLot(ParkingLot parkingLot) {
		ParkingLotEntity parkingLotEntity = parkingLotEntityMapper.toEntity(parkingLot);
		ParkingLotEntity savedEntity = parkingLotRepository.save(parkingLotEntity);

		return parkingLotEntityMapper.toDomainObj(savedEntity);
	}

}
