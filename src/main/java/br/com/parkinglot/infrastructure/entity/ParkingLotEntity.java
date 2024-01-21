package br.com.parkinglot.infrastructure.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "parking_lot")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ParkingLotEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private int capacity;

	@OneToMany(mappedBy = "parkingLot", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ParkingSpaceEntity> parkingSpaces;

	public List<ParkingSpaceEntity> getParkingSpaces() {
		return parkingSpaces;
	}

	public void setParkingSpaces(List<ParkingSpaceEntity> parkingSpaces) {
		this.parkingSpaces = parkingSpaces;
	}

	public ParkingLotEntity(int capacity) {
		this.capacity = capacity;
	}

}
