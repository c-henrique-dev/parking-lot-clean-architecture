package br.com.parkinglot.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "parking_lot_space")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ParkingSpaceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private int number;

	@ManyToOne
	@JoinColumn(name = "parking_lot_id")
	private ParkingLotEntity parkingLot;

	@ManyToOne
	@JoinColumn(name = "vehicle_id")
	private VehicleEntity vehicle;
	
	public ParkingSpaceEntity(int number, ParkingLotEntity parkingLot, VehicleEntity vehicle) {
		this.number = number;
		this.parkingLot = parkingLot;
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "ParkingSpaceEntity{" +
				"id=" + id +
				", number=" + number +
				", parkingLot=" + parkingLot +
				", vehicle=" + vehicle +
				'}';
	}
}
