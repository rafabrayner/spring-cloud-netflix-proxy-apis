package br.com.instituicoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InstituicoesAppConfig {

	public static void main(String[] args) {
		SpringApplication.run(InstituicoesAppConfig.class, args);
	}

}
