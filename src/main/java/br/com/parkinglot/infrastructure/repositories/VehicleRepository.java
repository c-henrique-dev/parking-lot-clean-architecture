package br.com.parkinglot.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.parkinglot.infrastructure.entity.VehicleEntity;

public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {

}
