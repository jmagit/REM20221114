package com.example.domains.entities.dtos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.example.domains.entities.Actor;

@Projection(name = "ActorShort", types = Actor.class)
public interface ActorShort {
	int getActorId();
	@Value("#{target.lastName + ', ' + target.firstName}")
	String getNombre();
}
