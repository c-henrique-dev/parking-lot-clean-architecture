package br.com.parkinglot.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.parkinglot.infrastructure.entity.ParkingSpaceEntity;

public interface ParkingSpaceRepository extends JpaRepository<ParkingSpaceEntity, Long> {

}
