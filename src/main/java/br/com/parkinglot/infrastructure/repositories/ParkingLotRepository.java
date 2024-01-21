package br.com.parkinglot.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.parkinglot.infrastructure.entity.ParkingLotEntity;

public interface ParkingLotRepository extends JpaRepository<ParkingLotEntity, Long> {

}
