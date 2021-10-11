package br.com.generation.ProjetoBloco1;

import java.util.Scanner;

public class dieta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

		int resp[] = new int[11];
		int c, pontos = 0, soma=0;
		

		// banco de dados das questões

		System.out.println("Resposta as pergunats a seguir de acordo com seu dia a dia");
		System.out.println("\n1 - Quando faço pequenos lanches ao longo do dia, costumo comer frutas ou castanhas");
		System.out.println("[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre");
		System.out.println("Resposta: ");
		resp[0] = leia.nextInt();
		
		System.out.println("\n===================================================================\n");

		System.out.println("\n 2 - Quando escolho frutas, verduras e legumes, dou preferência para aqueles que são de produção local");
		System.out.println("[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre");
		System.out.println("Resposta: ");
		resp[1] = leia.nextInt();
		
		System.out.println("\n===================================================================\n");

		System.out.println("\n 3 - Quando escolho frutas, legumes e verduras, dou preferência para aqueles que são orgânicos");
		System.out.println("[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre");
		System.out.println("Resposta: ");
		resp[2] = leia.nextInt();
		
		System.out.println("\n===================================================================\n");

		System.out.println("\n 4 - Costumo levar algum alimento comigo em caso de sentir fome ao longo do dia");
		System.out.println("[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre");
		System.out.println("Resposta: ");
		resp[3] = leia.nextInt();
		
		System.out.println("\n===================================================================\n");

		System.out.println("\n 5 - Costumo planejar as refeições que farei no dia.");
		System.out.println("[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre");
		System.out.println("Resposta: ");
		resp[4] = leia.nextInt();
		
		System.out.println("\n===================================================================\n");

		System.out.println("\n 6 - Costumo variar o consumo de feijão por ervilha, lentilha ou grão de bico");
		System.out.println("[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre");
		System.out.println("Resposta: ");
		resp[5] = leia.nextInt();
		
		System.out.println("\n===================================================================\n");

		System.out.println("\n 7 - Na minha casa é comum usarmos farinha de trigo integral ");
		System.out.println("[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre");
		System.out.println("Resposta: ");
		resp[6] = leia.nextInt();
		
		System.out.println("\n===================================================================\n");

		System.out.println("\n 8 - Costumo comer fruta no café da manhã ");
		System.out.println("[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre");
		System.out.println("Resposta: ");
		resp[7] = leia.nextInt();
		
		System.out.println("\n===================================================================\n");

		System.out.println("\n 9 - Costumo fazer minhas refeições sentado(a) à mesa. ");
		System.out.println("[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre");
		System.out.println("Resposta: ");
		resp[8] = leia.nextInt();
		
		System.out.println("\n===================================================================\n");

		System.out.println("\n 10- Procuro realizar as refeições com calma. ");
		System.out.println("[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre");
		System.out.println("Resposta: ");
		resp[9] = leia.nextInt();
		
		System.out.println("\n===================================================================\n");

		System.out.println("\n 11 - Costumo participars do preparo dos alimentos na minha casa ");
		System.out.println("[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre");
		System.out.println("Resposta: ");
		resp[10] = leia.nextInt();
		
		System.out.println("\n===================================================================\n");

		for (c = 0; c < 11; c++) {
				
			
			if (resp[c] == 0) {
				 pontos += 0;
				 soma = pontos;
				 
			}
			
			else if (resp[c] == 1) {
				 pontos += 1;
				 soma = pontos;
			}
			
			else if (resp[c] == 2) {
				 pontos += 2;
				 soma = pontos;
			}
			
			else if (resp[c] == 3) {
				 pontos += 3;
				 soma = pontos;
			}			
			else {
				System.out.println("Resposta incorreta");
				
			}
			
			
		}
		
		System.out.println("O resultado do seu teste retornou o total de "  + soma + " pontos.");
		System.out.println("\n==================================================\n");
		
		if(soma <= 12) {
			
			
			System.out.println("Sua alimentação requer atenção! \n"
					+ "Para ter uma alimentação saudável e prazerosa, você precisa mudar.");
			
		}
		
		else if (soma > 12 || soma <=18){
			
			System.out.println("Siga em frente!  \n"
					+ "Você está no meio do caminho para uma alimentação saudável");
		}
		
		else {
			
			System.out.println("Excelente! \n"
					+ "Parece que você tem uma alimentação saudável, em diversos aspectos.");
		}
		

		leia.close();

	}

}
