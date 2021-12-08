package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

	@Query("SELECT u FROM Usuario u WHERE u.email = ?1")
	public Usuario findByEmail(String email);
}