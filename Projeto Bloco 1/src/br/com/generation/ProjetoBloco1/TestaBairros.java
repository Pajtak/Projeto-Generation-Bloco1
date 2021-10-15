package br.com.generation.ProjetoBloco1;

import java.util.List;
import java.util.Scanner;

public class TestaBairros {
	
		public static void main(String[] args) {
		boolean terminar = false;
			while (!terminar) {
			String bairro;
			Scanner scanner = new Scanner(System.in);
			Bairros bairros = new Bairros();
			bairro = scanner.nextLine();
			List<String> resultado = bairros.getEnd().get(bairro);
			
			if (resultado == null) {
				System.out.println("O resultado não foi encontrado, por favor digite um dos bairros cobertos pelo aplicativo: ");
				}
			else {
				for (String obj: resultado) {
				System.out.println(obj);
				}
				terminar = true;
			
			
			scanner.close();
			}
			}
		}
		
		
		
	}


