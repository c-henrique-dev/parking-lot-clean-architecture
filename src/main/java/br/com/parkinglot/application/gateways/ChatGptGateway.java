package br.com.parkinglot.application.gateways;

import java.util.List;

import br.com.parkinglot.domain.model.ParkingLot;

public interface ChatGptGateway {
	List<ParkingLot> getConsult(String prompt);

}
