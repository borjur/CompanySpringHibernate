package com.boris.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boris.contacts.entities.Office;

public interface OfficeRepository extends JpaRepository<Office, Long> {
}
