package br.com.parkinglot.infrastructure.mappers;

import br.com.parkinglot.domain.model.ParkingLot;
import br.com.parkinglot.domain.model.ParkingSpace;
import br.com.parkinglot.domain.model.Vehicle;
import br.com.parkinglot.infrastructure.entity.ParkingLotEntity;
import br.com.parkinglot.infrastructure.entity.ParkingSpaceEntity;
import br.com.parkinglot.infrastructure.entity.VehicleEntity;

import java.util.ArrayList;

public class ParkingSpacetEntityMapper {

	public ParkingSpaceEntity toEntity(ParkingSpace parkingSpaceDomainObj) {
		ParkingLotEntity parkingLot = new ParkingLotEntity(parkingSpaceDomainObj.getParkingLot().getCapacity());
		VehicleEntity vehicle = new VehicleEntity(parkingSpaceDomainObj.getOccupiedVehicle().getLicensePlate());
		return new ParkingSpaceEntity(parkingSpaceDomainObj.getNumber(), parkingLot, vehicle);
	}

	public ParkingSpace toDomainObj(ParkingSpaceEntity parkingSpaceEntity) {
		ParkingLot parkingLot = new ParkingLot(parkingSpaceEntity.getParkingLot().getId(),
				parkingSpaceEntity.getParkingLot().getCapacity(), new ArrayList<>());
		Vehicle vehicle = new Vehicle(parkingSpaceEntity.getVehicle().getId(),
				parkingSpaceEntity.getVehicle().getLicensePlate());

		return new ParkingSpace(parkingSpaceEntity.getId(), parkingSpaceEntity.getNumber(), parkingLot, vehicle);
	}

}
