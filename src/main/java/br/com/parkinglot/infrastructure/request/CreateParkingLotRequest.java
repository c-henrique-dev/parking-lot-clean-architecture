package br.com.parkinglot.infrastructure.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateParkingLotRequest {
	private int capacity;

}
