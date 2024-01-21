package br.com.parkinglot.infrastructure.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateParkingSpaceRequest {
	private int number;
	private Long parkingLot;
	private Long occupiedVehicle;
}
