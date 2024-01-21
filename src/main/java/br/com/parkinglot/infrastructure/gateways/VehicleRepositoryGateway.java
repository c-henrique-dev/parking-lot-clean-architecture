package br.com.parkinglot.infrastructure.gateways;

import br.com.parkinglot.application.gateways.VehicleGateway;
import br.com.parkinglot.domain.model.Vehicle;
import br.com.parkinglot.infrastructure.entity.VehicleEntity;
import br.com.parkinglot.infrastructure.mappers.VehicleEntityMapper;
import br.com.parkinglot.infrastructure.repositories.VehicleRepository;

public class VehicleRepositoryGateway implements VehicleGateway {

	private final VehicleEntityMapper vehicleEntityMapper;
	private final VehicleRepository vehicleRepository;

	public VehicleRepositoryGateway(VehicleEntityMapper vehicleEntityMapper, VehicleRepository vehicleRepository) {
		super();
		this.vehicleEntityMapper = vehicleEntityMapper;
		this.vehicleRepository = vehicleRepository;
	}

	@Override
	public Vehicle createVehicle(Vehicle vehicle) {
		VehicleEntity vehicleEntity = vehicleEntityMapper.toEntity(vehicle);
		
		VehicleEntity savedEntity = vehicleRepository.save(vehicleEntity);
		return vehicleEntityMapper.toDomainObj(savedEntity);
	}

}
