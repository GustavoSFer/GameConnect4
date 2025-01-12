package br.com.fernandes.core;

public class Tabuleiro {
	
	private final int linhas;
	private final int colunas;
	private final String[][] grid;
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.grid = new String[linhas][colunas];
	}
	
}
