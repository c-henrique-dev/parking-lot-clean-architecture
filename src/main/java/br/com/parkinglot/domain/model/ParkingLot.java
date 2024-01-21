package br.com.parkinglot.domain.model;

import java.util.List;

public class ParkingLot {
	private Long id;
	private int capacity;

	private List<ParkingSpace> parkingSpaces;

	public ParkingLot() {

	}

	public ParkingLot(int capacity) {
		this.capacity = capacity;
	}

	public ParkingLot(Long id, int capacity, List<ParkingSpace> parkingSpaces) {
		this.id = id;
		this.capacity = capacity;
		this.parkingSpaces = parkingSpaces;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
