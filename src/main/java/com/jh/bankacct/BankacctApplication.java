package com.jh.bankacct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BankacctApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankacctApplication.class, args);
	}

}
