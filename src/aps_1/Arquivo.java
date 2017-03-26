package aps_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
		//Classe para a leitura do arquivo
	
	public static String Read(String caminho){
		String conteudo = "";
		
		try{
			FileReader arq = new FileReader(caminho);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha ="";
			try{
				linha = lerArq.readLine();
				while(linha!=null){
					conteudo += linha;
					linha = lerArq.readLine();
				}
				arq.close();
			}catch(IOException ex){
				System.out.println("Erro: N�o pode ler o arquivo");
				return "Erro: N�o pode ler o arquivo";
			}
		} catch(FileNotFoundException ex){
			System.out.println("Erro: Arquivo n�o encontrado");
			return "Erro: Arquivo n�o encontrado";
		}
	return conteudo;
		
	}// Fim do m�todo de leitura
	
}
