/* @authors Guilherme de Sousa Virdiano e Helen Lissa Sonoda
 * Date: 18/10/2021
 */

package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Imc {
	
	static void validacaoIdade(int idade, double peso, double altura, String sexo) {
		
		if(idade < 10){
			JOptionPane.showMessageDialog(null, "A idade não é válida para o cálculo de IMC.\n\nO cálculo do IMC será encerrado.\n\n ",
					"Aviso", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			calculoPorIdade(idade, peso, altura, sexo);
		}
	}
	
	static void calculoPorIdade(int idade, double peso, double altura, String sexo) {
		
		if(idade >= 10 && idade <= 19) {
			
			switch(sexo) {
				case "F", "f":
					calcularImcAdolecF(idade, peso, altura);
					break;
				case "M", "m":
					calcularImcAdolecM(idade, peso, altura);
					break;
			}
			
		}
		else if(idade >= 20 && idade < 60){
			calcularImcAdulto(peso, altura);
			
		}
		else if(idade >= 60){
			calcularImcIdoso(peso, altura);
			
		}
	}
	
	static void calcularImcAdolecF(int idade, double p, double a) { // calculo para crianças adolescentes feminino de 10 a 19 anos
		
		double imcF = p/(a*a);
		
		switch(idade) {
			case 10:
			
			if(imcF < 14.23) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 14.23 && imcF <= 20.19) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");
			
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");
				
			}
			break;
		case 11:
			
			if(imcF < 14.60) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");	
				
			} else if (imcF >= 14.60 && imcF <= 21.18) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");				
			}
			break;
		case 12:
			
			if(imcF < 14.98) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");	
				
			} else if (imcF >= 14.98 && imcF <= 22.17) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");				
			}
			break;
		case 13:
			
			if(imcF < 15.36) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 15.36 && imcF <= 23.08) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");						
			}
			break;
		case 14:
			
			if(imcF < 15.67) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 15.67 && imcF <= 23.88) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
							
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");						
			}
			break;
		case 15:
			
			if(imcF < 16.01) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 16.01 && imcF <= 24.29) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "	não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ " polichinelos ou pular corda.");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");
			}
			break;
		case 16:
			
			if(imcF < 16.37) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 16.37 && imcF <= 24.74) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");				
			}
			break;
		case 17:
			
			if(imcF < 16.59) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 16.59 && imcF <= 25.23) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");					
			}
			break;
		case 18:
			
			if(imcF < 16.71) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 16.71 && imcF <= 25.56) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");					
			}
			break;
		case 19:
			
			if(imcF < 16.87) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 16.87 && imcF <= 25.85) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
							
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcF + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");					
			}
			break;
			
			default: 
				
				JOptionPane.showMessageDialog(null,"O seu IMC é: "  + imcF + "\nNão foi possível realizar o cálculo. " + "Entre novamente com o seu peso e altura.");
				
			break;
		}
		
	}
	
	static void calcularImcAdolecM(int idade, double p, double a) { // calculo para crianças adolescentes masculino de 10 a 19 anos
		
		double imcM = p/(a*a);
		
		switch (idade) 
		{
		case 10:
			
			if(imcM < 14.42) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcM >= 14.42 && imcM <= 19.6) {
				JOptionPane.showMessageDialog(null, " \n\nO seu IMC é: " + imcM + ". ", "Aviso", JOptionPane.INFORMATION_MESSAGE);	
				JOptionPane.showMessageDialog(null, "\nVocê está com o peso normal, caso queira mudar ou não está confortavel com ele, "
						+ "\nvocê pode realizar exercícios leves, como caminhadas, polichinelos ou pular corda. ");
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");						
			}
			break;
		case 11:
			
			if(imcM < 14.83) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcM >= 14.83 && imcM <= 20.35) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");						
			}
			break;
		case 12:
			
			if(imcM < 15.24) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcM >= 15.24 && imcM <= 21.12) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");						
			}
			break;
		case 13:
			
			if(imcM < 15.73) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcM >= 15.73 && imcM <= 21.93) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");						
			}
			break;
		case 14:
			
			if(imcM < 16.18) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
									
			} else if (imcM >= 16.18 && imcM <= 22.77) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
								
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");						
			}
			break;
		case 15:
			
			if(imcM < 16.59) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
									
			} else if (imcM >= 16.59 && imcM <= 23.63) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
												
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");						
			}
			break;
		case 16:
			
			if(imcM < 17.01) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
														
			} else if (imcM >= 17.01 && imcM <= 24.45) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
																
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");						
			}
			break;
		case 17:
			
			if(imcM < 17.31) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
														
			} else if (imcM >= 17.31 && imcM <= 25.28) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
																				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");							
			}
			break;
		case 18:
			
			if(imcM < 17.54) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
																			
			} else if (imcM >= 17.54 && imcM <= 25.95) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
																						
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");							
			}
			break;
		case 19:
			
			if(imcM < 17.8) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
																			
			} else if (imcM >= 17.8 && imcM <= 26.36) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
																					
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcM + "\nVocê está com sobrepeso, isso pode ser prejudicial a sua saúde, "
						+ "							é recomendavel que entre em contato com um profissinal de saúde qualificado para orienta-lo sobre que medidas você deve tomar"
						+ "							se esse não for o seu caso e você deseja mudar, recomendamos que faça exercícios leves como caminha e polichinelo para melhorar o seu cardio");						
			}
			break;
			
			default: 
				
				JOptionPane.showMessageDialog(null,"O seu IMC é: "  + imcM + "\nNão foi possível realizar o cálculo. " + "Entre novamente com o seu peso e altura.");
				
			break;
		}
		
	}
		
	static void calcularImcAdulto(double p, double a) { //calculo do imc para adultos de 20 a 59 anos
		
		double imcA = p/(a*a);
		
		if(imcA < 18.5) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcA + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar como mudar os seus habitos alimentares");			
		
		} else if( imcA >= 18.5 && imcA <= 24.9) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcA + "\nVocê está com o peso normal, mas quaso queira mudar recomendados exercícios leves"
						+ 							"como caminhadas, corridas e polichinelos agora para "
						+ "							os familiarizados o BURPEE possui um set de exercícios mais intensos");
		
		} else if( imcA >= 25.0 && imcA <= 29.9) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcA + "\nVocê está com pré-obesidade, isso pode levar a problemas de sáude"
						+ "recomendamos que procure fazer exercícios leves como caminhada, polichinelos, pular corda e procure ajuda de um nutricionista para analisar seus habitos alimentares");					
		
		} else if( imcA >= 30.0 && imcA <= 34.9) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcA + "\nVoce está com Grau 1 de obesidade, isso pode levar a problemas de saúde"
						+ "recomendamos que procure realizar exercícios leves como caminhas, polichinelos, pular corda e procure ajuda de um nutricionista para analisar seus habitos alimentares");
				
		} else	if( imcA >= 35.0 && imcA <= 39.9) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcA + "\nVocê está com Grau 2 de obesidade,  isso pode levar a problemas de saúde "
						+ "					recomendamos que procure realizar exercícios leves como caminhas e/ou polichinelos e procure ajuda de um nutricionista para analisar seus habitos alimentares");
				
		} else if( imcA >= 40) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcA + "\nVocê está com Grau 3 de obesidade, isso pode afetar a sua saúde de forma negativa, "
						+ "						recomendamos que procure um profissinal de saúde para orientações mais completas ");						
		}
		
	}
	
	static void calcularImcIdoso(double p, double a) { // cálculo para idosos, idade igual ou acima de 60 anos
		
		double imcI = p/(a*a);
		
		if(imcI < 22.0) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcI + "\nVocê está abaixo do peso, caso queira mudar ou "
						+ "						não se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
												
		} else if( imcI >= 22.0 && imcI <= 27.0) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcI + "\nVocê está com o peso normal, caso queira mudar ou "
						+ "							não está confortavel com ele, você pode realizar exercícios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
		} else if( imcI >= 28.0) {
				JOptionPane.showMessageDialog(null, "O seu IMC é: " + imcI + "\nVocê está com pré-obesidade, isso pode levar a problemas de sáude"
						+ "recomendamos que procure fazer exercícios leves como caminhada, polichinelos, pular corda e procure ajuda de um nutricionista para analisar seus habitos alimentares");	
		}
		
	}
	

}
