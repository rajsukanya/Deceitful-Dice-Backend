package com.ramrod.DeceifultDice;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		encoder.encode("password@!23@#!");
		
		String encodedString = encoder.encode("password@!23@#!");
		System.out.println(encodedString);
	}

}
