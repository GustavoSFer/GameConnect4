package br.com.fernandes.core;

import java.util.Iterator;

public class Tabuleiro {
	
	private final int linhas;
	private final int colunas;
	private final String[][] grid;
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.grid = new String[linhas][colunas];
	}
	
	public void iniciarTabuleiro() {
		for (int i = 0; i < this.linhas; i++) {
			for (int j = 0; j < this.colunas; j++) {
				this.grid[i][j] = "."; 
			}
		}
	}
	
	public void mostrarTabuleiro() {
		for (String[] linha : this.grid) {
			for (String celula : linha) {
				System.out.print( celula + " ");
			}
			System.out.println();
		}
	}
	
	public boolean posicionarDisco(int coluna, String simbolo ) {
		if (coluna < 0 || coluna >= this.colunas) return false;
		
		for (int i = this.linhas; i >= 0; i--) {
			if (this.grid[i][coluna].equals(".")) {
				this.grid[i][coluna] = simbolo;
				return true;
			}
		}
		return false;
	}
	
}
