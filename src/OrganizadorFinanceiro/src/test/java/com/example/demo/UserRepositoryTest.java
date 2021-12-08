package com.example.demo;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.example.demo.model.entities.Usuario;
import com.example.demo.repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
	
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private UserRepository repo;
	
//test
	public void testCreateUser() {
		Usuario user = new Usuario();
		user.setEmail("joao@gmail.com");
		user.setPassword("joao123");
		user.setPrimeiroNome("João");
		user.setSobrenome("Silva");
	
		Usuario savedUser = repo.save(user);
		
		Usuario existUser = entityManager.find(Usuario.class, savedUser.getId());
		
		assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
	}
	
	@Test
	public void testFindUserByEmail() {
		String email = "boça@bol.com";
		
		Usuario user = repo.findByEmail(email);
		
		assertThat(user).isNotNull();
	}
	
}
