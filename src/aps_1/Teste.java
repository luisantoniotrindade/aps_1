package aps_1;

import java.io.File;

import aps_1.Arquivo;

public class Teste {

	public static void main(String[] args) {
		/*
		 * Implementar um programa, que lê um arquivo contendo a descrição de uma matriz contendo apenas os valores 1 e 0,
		 * e imprimir, na tela, a matriz contida no arquivo.
		 * 
		 * Com a matriz carregada em memória, criar duas cópias da matriz, e, em uma delas, trocar os valores 1 para 2,
		 * e na outra, trocar os valores 0 para 2.
		 * 
		 * O arquivo que deve ser lido contém, na primeira linha, o número de colunas e linhas da matriz,
		 * nas linhas seguintes, onde cada uma representa uma linha da matriz, encontram-se os dados de cada coluna daquela linha,
		 * com uma string formada por 1 e 0.
		 * 
		 * */
		
		//Lendo o primeiro arquivo txt
		String arq = "src/txt/example_1.txt";
		
		
		String texto = Arquivo.Read(arq);
		if(texto.isEmpty()){
			System.out.println(arq);
			System.out.println("Arquivo vazio!");
		}else{
			System.out.println(texto);
		}
	}

}
