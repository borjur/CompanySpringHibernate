package com.boris.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boris.contacts.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
