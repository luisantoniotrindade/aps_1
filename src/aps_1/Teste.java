package aps_1;

import aps_1.Arquivo;

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
		 * 
		 * */
		
		//Lendo o primeiro arquivo txt
		
		//Salvando o caminho do arquivo
		String arq = "src/txt/example_4.txt";
		
		//Lendo o arquivo txt
		String texto = Arquivo.Read(arq);
		
		//Abrindo o arquivo e armazenando ele em um vetor
		String[] vetorTexto = texto.split("");
		
		//Teste para visualizar o arquivo
			/*for(int i =0; i < vetorTexto.length ; i++){
				System.out.println(vetorTexto[i]);
			} */
		
		
		//Definindo dados pelo cabeçalho
			
		int coluna = Integer.parseInt(vetorTexto[0]);
		System.out.println("Qt. de Colunas: "+coluna);
			
		int linha = Integer.parseInt(vetorTexto[2]);
		System.out.println("Qt. de Linhas: "+linha+"\n\n");
		
		Integer[][] matriz = new Integer[coluna][linha];
		
		//iniciando a partir do terceiro campo do vetor e populando o array
		int contador = 3;
		for(int lin = 0; lin < linha ; lin++){
			for(int col = 0; col < coluna ; col++){
				matriz[col][lin] = Integer.parseInt(vetorTexto[contador]);
				contador++;
			}
		}
		
		//
		
		
		//exibindo o array
		for(int lin = 0; lin < linha ; lin++){
			System.out.print("|");
			for(int col = 0; col < coluna ; col++){
				System.out.print(matriz[col][lin].intValue());
				System.out.print("|");
			}
			System.out.println();
		}
		
			
			
		//Mostrando o arquivo aberto no final
		if(texto.isEmpty()){
			System.out.println(arq);
			System.out.println("Arquivo vazio!");
		}else{
			System.out.println("\n\nArquivo Original:");
			System.out.println(texto);
		}
	}

}
