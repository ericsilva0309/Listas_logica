package com.poo.exercisiosdoroni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercisiosdoroniApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercisiosdoroniApplication.class, args);

		Exercicio1.resolucao();

	}

}
