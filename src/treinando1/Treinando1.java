package treinando1;

import java.util.Scanner;

public class Treinando1 {


	public static void main(String[] args) {
		//A linha abaixo  cria um Scanner. Um Scanner � usado para lermos os dados que o usu�rio digitar pelo teclado
			Scanner leitor = new Scanner(System.in);
			
			String nomeUsuario;
			
			System.out.println("Por favor, escreva seu nome:");
			//A linha abaixo l� o texto que o usu�rio escrever no seu teclado 
			nomeUsuario = leitor.next();
			
			System.out.println(" Obrigado por utilizar o programa , " + nomeUsuario);
		
			
				leitor.close();
	}

}
