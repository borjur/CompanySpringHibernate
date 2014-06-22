package com.boris.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boris.contacts.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
