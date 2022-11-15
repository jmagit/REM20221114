package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;

import com.example.domains.contracts.repositories.ActorRepository;
import com.example.domains.entities.Actor;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	ActorRepository dao;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Arranque completado");
		
//		var actor = new Actor(217, "pepito", "PEREZ");
//		dao.deleteById(215);
//		var item = dao.findById(217);
//		if(item.isPresent()) {
//			var actor = item.get();
//			actor.setFirstName(actor.getFirstName().toUpperCase());
//			dao.save(actor);			
//		} else {
//			System.out.println("No encontrado");
//		}
//		dao.findAll().forEach(System.out::println);
//		dao.findTop5ByFirstNameStartingWithOrderByLastNameDesc("p").forEach(System.out::println);
//		dao.findTop5ByFirstNameStartingWith("p", Sort.by("firstName").descending()).forEach(System.out::println);
		dao.findByActorIdGreaterThanEqual(200).forEach(System.out::println);
		dao.findNovedadesJPQL(200).forEach(System.out::println);
		dao.findNovedadesSQL(200).forEach(System.out::println);
		dao.findAll((root, query, builder) -> builder.greaterThanOrEqualTo(root.get("actorId"), 200)).forEach(System.out::println);
		dao.findAll((root, query, builder) -> builder.lessThanOrEqualTo(root.get("actorId"), 10)).forEach(System.out::println);
	}

}
