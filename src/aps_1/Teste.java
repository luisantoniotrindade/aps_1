package aps_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class Teste {

	public static void main(String[] args) {
		/*
		 * Implementar um programa, que l� um arquivo contendo a descri��o de uma matriz
		 * contendo apenas os valores 1 e 0, e imprimir, na tela, a matriz contida no arquivo.
		 * 
		 * Com a matriz carregada em mem�ria, criar duas c�pias da matriz, e,
		 * em uma delas, trocar os valores 1 para 2,
		 * e na outra, trocar os valores 0 para 2.
		 * 
		 * O arquivo que deve ser lido cont�m, na primeira linha, o n�mero de colunas e linhas da matriz,
		 * nas linhas seguintes, onde cada uma representa uma linha da matriz, encontram-se os dados de cada coluna daquela linha,
		 * com uma string formada por 1 e 0.
		 */
		
		
		 //Declara��o de vari�veis
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
	            
	            //Loop para o armazenamento da matriz
	            
	            //Enquanto tem linhas...
	            while(entrada.hasNext()==true){

	            	for(int lin = 0; lin < linha;lin++){
	            		//Quebrando a linha obtida em vari�veis �nicas para o armazenamento
	            		String[] linhasoriginais = entrada.next().split("");
	            		for(int col = 0; col < coluna; col++){matriz[col][lin] = Integer.parseInt(linhasoriginais[col]);}	
	            	}
	            }
	            
	            //Populando a matriz com zero.
	            Integer matrizzeros[][] = new Integer[coluna][linha];
	            for(int lin = 0; lin < linha ; lin++){
	            	for(int col = 0; col < coluna ; col++){if(matriz[col][lin]==1){matrizzeros[col][lin] = 0;}else{matrizzeros[col][lin] = matriz[col][lin];}
	            	}
	            }

	            //Populando a matriz com um.

	            Integer matrizum[][] = new Integer[coluna][linha];
	            for(int lin = 0; lin < linha ; lin++){ for(int col = 0; col < coluna ; col++){
	            		if(matriz[col][lin]==0){matrizum[col][lin] = 1;}else{matrizum[col][lin] = matriz[col][lin];}
	            	}
	            }
	            
	            
	            //Exibi��o da matriz principal
	            System.out.println("Matriz Principal:\n");
	            for(int lin = 0; lin < linha;lin++){System.out.print("|");for(int col = 0; col < coluna; col++){
            			System.out.print(matriz[col][lin].intValue());System.out.print("|");		
            		}System.out.println();
            	} System.out.println("- - - - - - - - - - - - - - - - - -\n");
	            
	          //exibindo o array
	            System.out.println("Matriz com zeros:\n");
	            for(int lin = 0; lin < linha ; lin++){System.out.print("|");for(int col = 0; col < coluna ; col++){
	            		System.out.print(matrizzeros[col][lin].intValue());System.out.print("|");
	            	}System.out.println();
	            }System.out.println("- - - - - - - - - - - - - - - - - -\n");

	            //exibindo o array
	            System.out.println("Matriz com um:\n");
	            for(int lin = 0; lin < linha ; lin++){System.out.print("|");for(int col = 0; col < coluna ; col++){
	            		System.out.print(matrizum[col][lin].intValue());System.out.print("|");
	            	}System.out.println();
	            } System.out.println("- - - - - - - - - - - - - - - - - -\n");
	            
	            
	            
	        //fim do try
	        }
	       
	        catch ( java.io.IOException exc )
	        {
	        System.out.println("Erro: N�o pode ler o arquivo");
	    }
		
	
	}

}
