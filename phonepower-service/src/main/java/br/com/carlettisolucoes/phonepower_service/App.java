package br.com.carlettisolucoes.phonepower_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableJpaRepositories
@AutoConfigurationPackage
public class App {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
	
}
