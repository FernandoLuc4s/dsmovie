package com.dsmovie.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsmovie.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> { // criação do repository
	
	User findByEmail(String email); // busca por email
}
