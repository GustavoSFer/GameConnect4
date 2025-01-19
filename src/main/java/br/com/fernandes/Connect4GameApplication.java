package br.com.fernandes;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fernandes.core.Tabuleiro;

@SpringBootApplication
public class Connect4GameApplication {

	public static void main(String[] args) {
		SpringApplication.run(Connect4GameApplication.class, args);
		
		Tabuleiro tab = new Tabuleiro(6, 7);
		
		tab.iniciarTabuleiro();
		tab.mostrarTabuleiro();
	}

}
