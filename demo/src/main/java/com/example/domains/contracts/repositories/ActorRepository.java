package com.example.domains.contracts.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.example.domains.entities.Actor;
import com.example.domains.entities.dtos.ActorDTO;
import com.example.domains.entities.dtos.ActorShort;

public interface ActorRepository extends JpaRepository<Actor, Integer>, JpaSpecificationExecutor<Actor> {
	List<Actor> findTop5ByFirstNameStartingWithOrderByLastNameDesc(String prefijo);
	List<Actor> findTop5ByFirstNameStartingWith(String prefijo, Sort orden);
	
	List<Actor> findByActorIdGreaterThanEqual(int idInicial);
	@Query("SELECT a FROM Actor a WHERE a.actorId >= ?1")
	List<Actor> findNovedadesJPQL(int idInicial);
	@Query(value =  "SELECT * FROM actor a WHERE a.actor_id >= ?1", nativeQuery = true)
	List<Actor> findNovedadesSQL(int idInicial);
	
	@Query("SELECT a FROM Actor a")
	List<ActorShort> dameTodosCorto();
	@Query("SELECT a FROM Actor a")
	List<ActorDTO> dameTodosDto();
	
	<T> Iterable<T> findAllBy(Class<T> proyeccion);
	<T> Iterable<T> findAllBy(Sort orden, Class<T> proyeccion);
	<T> Page<T> findAllBy(Pageable page, Class<T> proyeccion);

}
