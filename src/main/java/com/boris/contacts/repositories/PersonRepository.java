package com.boris.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boris.contacts.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
