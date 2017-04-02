package aps_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class Teste {

	public static void main(String[] args) {
		/*
		 * Implementar um programa, que lê um arquivo contendo a descrição de uma matriz
		 * contendo apenas os valores 1 e 0, e imprimir, na tela, a matriz contida no arquivo.
		 * 
		 * Com a matriz carregada em memória, criar duas cópias da matriz, e,
		 * em uma delas, trocar os valores 1 para 2,
		 * e na outra, trocar os valores 0 para 2.
		 * 
		 * O arquivo que deve ser lido contém, na primeira linha, o número de colunas e linhas da matriz,
		 * nas linhas seguintes, onde cada uma representa uma linha da matriz, encontram-se os dados de cada coluna daquela linha,
		 * com uma string formada por 1 e 0.
		 */
		
		 File arquivo = new File("src/txt/example_3.txt");
	        Scanner entrada = null;
	        int coluna,linha;
	       
	        try
	        {
	       
	            entrada = new Scanner(new BufferedReader( new FileReader(arquivo.getPath())));
	            coluna = entrada.nextInt();
	            linha = entrada.nextInt();
	           
	            System.out.println("Qt. de Colunas: "+coluna);
	   
	            System.out.println("Qt. de Linhas: "+linha+"\n\n");
	   
	            Integer[][] matriz = new Integer[coluna][linha];
	           
	            while(entrada.hasNext()==true){
	            	System.out.println("teste"+entrada.nextLine());
	            	
	            }
	        //fim do try
	        }
	       
	        catch ( java.io.IOException exc )
	        {
	        System.out.println("Erro: Não pode ler o arquivo");
	    }
		
	
	}

}
