package com.example.demo.config.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawpassword = "tuco123";
		String encodedPassword = encoder.encode(rawpassword);
		
		System.out.println(encodedPassword);
		
		
	}

}
