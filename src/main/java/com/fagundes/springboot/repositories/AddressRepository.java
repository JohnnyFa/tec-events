package com.fagundes.springboot.repositories;

import com.fagundes.springboot.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AddressRepository extends JpaRepository <Address, UUID> {
    public Optional<Address> findByEventId(UUID eventId);
}
