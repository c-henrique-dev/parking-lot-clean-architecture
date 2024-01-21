package br.com.parkinglot.infrastructure.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.parkinglot.infrastructure.entity.ParkingLotEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class ChatGptQueryBuilder {

	@PersistenceContext
	EntityManager em;

	public List<ParkingLotEntity> getParkingLot(String jppq) {
		String jpql = jppq;
		TypedQuery<ParkingLotEntity> query = em.createQuery(jpql, ParkingLotEntity.class);
		return query.getResultList();
	}
}
