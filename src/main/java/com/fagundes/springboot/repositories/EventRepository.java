package com.fagundes.springboot.repositories;

import com.fagundes.springboot.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository  extends JpaRepository<Event, UUID> {
}
