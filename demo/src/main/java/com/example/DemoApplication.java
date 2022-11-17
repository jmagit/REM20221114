package com.example;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Sort;
import org.springframework.web.client.RestTemplate;

import com.example.domains.contracts.repositories.ActorRepository;
import com.example.domains.contracts.services.ActorService;
import com.example.domains.entities.Actor;
import com.example.domains.entities.dtos.ActorDTO;
import com.example.domains.entities.dtos.ActorShort;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	@Primary
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
//
//	@Bean
//	@LoadBalanced
//	public RestTemplate restTemplateLB() {
//		return new RestTemplate();
//	}
//
//	@Bean
//	public ReactorLoadBalancer<ServiceInstance> randomLoadBalancer(Environment environment,
//			LoadBalancerClientFactory loadBalancerClientFactory) {
//		String name = environment.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
//		name = "CATALOGO-SERVICE";
//		return new RandomLoadBalancer(
//				loadBalancerClientFactory.getLazyProvider(name, ServiceInstanceListSupplier.class), name);
//	}

	@Autowired
	ActorRepository dao;
	
	@Autowired
	ActorService srv;
	
	@Override
	@Transactional
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
//		dao.findByActorIdGreaterThanEqual(200).forEach(System.out::println);
//		dao.findNovedadesJPQL(200).forEach(System.out::println);
//		dao.findNovedadesSQL(200).forEach(System.out::println);
//		dao.findAll((root, query, builder) -> builder.greaterThanOrEqualTo(root.get("actorId"), 200)).forEach(System.out::println);
//		dao.findAll((root, query, builder) -> builder.lessThanOrEqualTo(root.get("actorId"), 10)).forEach(System.out::println);
		
//		var item = dao.findById(1);
//		if(item.isPresent()) {
//			var actor = item.get();
//			System.out.println(actor);
//			actor.getFilmActors().forEach(p -> System.out.println(p.getFilm().getTitle()));
//		} else {
//			System.out.println("No encontrado");
//		}
//		var actor = new Actor(217, null, "12345678z");
//		if(actor.isValid()) {
//			dao.save(actor);
//			dao.findAll().forEach(System.out::println);
//		} else {
//			System.out.println(actor.getErrorsMessage());
//		}
//		var dto = new ActorDTO(217, null, "12345678z");
//		dao.findAll().forEach(p -> System.out.println(ActorDTO.from(p)));
//		dao.dameTodosDto().forEach(System.out::println);
//		dao.dameTodosCorto().forEach(p -> System.out.println(p.getActorId() + " - " + p.getNombre()));
//		dao.findAllBy(ActorDTO.class).forEach(System.out::println);
//		dao.findAllBy(ActorShort.class).forEach(p -> System.out.println(p.getNombre() + " - " + p.getActorId()));
//		srv.getByProjection(ActorDTO.class).forEach(System.out::println);
	}

}
