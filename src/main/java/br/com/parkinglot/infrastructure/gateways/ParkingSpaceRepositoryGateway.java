package br.com.parkinglot.infrastructure.gateways;

import java.util.Optional;

import br.com.parkinglot.application.gateways.ParkingSpaceGateway;
import br.com.parkinglot.domain.model.ParkingSpace;
import br.com.parkinglot.infrastructure.entity.ParkingLotEntity;
import br.com.parkinglot.infrastructure.entity.ParkingSpaceEntity;
import br.com.parkinglot.infrastructure.entity.VehicleEntity;
import br.com.parkinglot.infrastructure.mappers.ParkingSpacetEntityMapper;
import br.com.parkinglot.infrastructure.repositories.ParkingLotRepository;
import br.com.parkinglot.infrastructure.repositories.ParkingSpaceRepository;
import br.com.parkinglot.infrastructure.repositories.VehicleRepository;

public class ParkingSpaceRepositoryGateway implements ParkingSpaceGateway {

	private final ParkingSpaceRepository parkingSpaceRepository;
	private final VehicleRepository vehicleRepository;
	private final ParkingLotRepository parkingLotRepository;
	private final ParkingSpacetEntityMapper parkingSpaceEntityMapper;

	public ParkingSpaceRepositoryGateway(ParkingSpaceRepository parkingSpaceRepository,
			ParkingSpacetEntityMapper parkingSpaceEntityMapper, VehicleRepository vehicleRepository,
			ParkingLotRepository parkingLotRepository) {
		this.parkingSpaceRepository = parkingSpaceRepository;
		this.parkingSpaceEntityMapper = parkingSpaceEntityMapper;
		this.vehicleRepository = vehicleRepository;
		this.parkingLotRepository = parkingLotRepository;
	}

	@Override
	public ParkingSpace createParkingSpace(ParkingSpace parkingSpace) {
		ParkingSpaceEntity parkingSpaceEntity = parkingSpaceEntityMapper.toEntity(parkingSpace);

		Optional<VehicleEntity> vehicleEntity = this.vehicleRepository
				.findById(parkingSpace.getOccupiedVehicle().getId());
		parkingSpaceEntity.setVehicle(vehicleEntity.get());

		Optional<ParkingLotEntity> parkingLotEntity = this.parkingLotRepository
				.findById(parkingSpace.getParkingLot().getId());
		parkingSpaceEntity.setParkingLot(parkingLotEntity.get());

		ParkingSpaceEntity savedEntity = parkingSpaceRepository.save(parkingSpaceEntity);

		return parkingSpaceEntityMapper.toDomainObj(savedEntity);
	}

}
