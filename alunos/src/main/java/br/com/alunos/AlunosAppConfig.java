package br.com.alunos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlunosAppConfig {

	public static void main(String[] args) {
		SpringApplication.run(AlunosAppConfig.class, args);
	}

}
