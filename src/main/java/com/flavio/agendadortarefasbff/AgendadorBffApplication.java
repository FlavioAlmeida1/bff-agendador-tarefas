package com.flavio.agendadortarefasbff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AgendadorBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendadorBffApplication.class, args);
	}

}
