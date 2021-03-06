package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppControler {

	@Autowired
	private UserRepository repo;
	
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
	    model.addAttribute("user", new Usuario());
	     
	    return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(Usuario user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		
		repo.save(user);
		
		return "register_success";
	}
	
	@GetMapping("/list_users")
	public String viewUsersList(Model model) {
		List<Usuario> listUsers = repo.findAll();
		model.addAttribute("listUsers", listUsers);
		return "users";
	}
}
