package br.com.parkinglot.infrastructure.mappers;

import br.com.parkinglot.domain.model.ParkingLot;
import br.com.parkinglot.domain.model.ParkingSpace;
import br.com.parkinglot.domain.model.Vehicle;
import br.com.parkinglot.infrastructure.entity.ParkingLotEntity;
import br.com.parkinglot.infrastructure.entity.ParkingSpaceEntity;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotEntityMapper {

	public ParkingLotEntity toEntity(ParkingLot parkingLotDomainObj) {
		return new ParkingLotEntity(parkingLotDomainObj.getCapacity());
	}

	public ParkingLot toDomainObj(ParkingLotEntity parkingLotEntity) {
		List<ParkingSpace> parkingSpaces = new ArrayList<>();

		for (ParkingSpaceEntity parkingSpaceEntity : parkingLotEntity.getParkingSpaces()) {
			Vehicle vehicle = new Vehicle(parkingSpaceEntity.getVehicle().getId(), parkingSpaceEntity.getVehicle().getLicensePlate());
			ParkingLot parkingLot = new ParkingLot(parkingLotEntity.getCapacity());
			ParkingSpace parkingSpace = new ParkingSpace(parkingSpaceEntity.getNumber(), parkingLot, vehicle);
			parkingSpaces.add(parkingSpace);
			return new ParkingLot(parkingLotEntity.getId(), parkingLotEntity.getCapacity(), parkingSpaces);
		}

		return null;
	}
}
