package br.com.parkinglot.domain.model;

public class ParkingSpace {
	private Long id;
	private int number;
	private ParkingLot parkingLot;
	private Vehicle occupiedVehicle;

	public ParkingSpace(Long id, int number, ParkingLot parkingLot, Vehicle occupiedVehicle) {
		this.id = id;
		this.number = number;
		this.parkingLot = parkingLot;
		this.occupiedVehicle = occupiedVehicle;
	}

	public ParkingSpace(int number, ParkingLot parkingLot, Vehicle occupiedVehicle) {
		this.number = number;
		this.parkingLot = parkingLot;
		this.occupiedVehicle = occupiedVehicle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public ParkingLot getParkingLot() {
		return parkingLot;
	}

	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}

	public Vehicle getOccupiedVehicle() {
		return occupiedVehicle;
	}

	public void setOccupiedVehicle(Vehicle occupiedVehicle) {
		this.occupiedVehicle = occupiedVehicle;
	}

}
