package br.com.parkinglot.application.usercases;

import java.util.List;

import br.com.parkinglot.application.gateways.ChatGptGateway;
import br.com.parkinglot.domain.model.ParkingLot;

public class ChatGptIntegrationUseCase {
	
	private final ChatGptGateway chatGptGateway;
	
	
	public ChatGptIntegrationUseCase(ChatGptGateway chatGptGateway) {
		this.chatGptGateway = chatGptGateway;
	}
	
	public List<ParkingLot> execute(String prompt) {
		return this.chatGptGateway.getConsult(prompt);
	}

}
