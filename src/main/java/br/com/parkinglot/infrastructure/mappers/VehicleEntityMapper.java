package br.com.parkinglot.infrastructure.mappers;

import br.com.parkinglot.domain.model.Vehicle;
import br.com.parkinglot.infrastructure.entity.VehicleEntity;

public class VehicleEntityMapper {
	
	public VehicleEntity toEntity(Vehicle vehicleDomainObj) {
		return new VehicleEntity(vehicleDomainObj.getLicensePlate());
	}

	public Vehicle toDomainObj(VehicleEntity vehicleEntity) {
		return new Vehicle(vehicleEntity.getId(), vehicleEntity.getLicensePlate());
	}

}
