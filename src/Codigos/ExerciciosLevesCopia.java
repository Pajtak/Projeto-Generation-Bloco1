package Codigos;

import javax.swing.JOptionPane;

public class ExerciciosLevesCopia {
	
	/*public static void main (String [] args) {
		
		double imcF = 0.0, imcM = 0.0;
		
		imcFeminino(imcF, 0);
		imcMasculino(imcM, 0);
		
		
	}*/
	
	public static void imcFeminino(double imcF, int idade) 
	{
		switch (idade) 
		{
		case 10:
			
			if(imcF < 14.23) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� abaixo do peso, caso queira mudar ou "
						+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 14.23 && imcF <= 20.19) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com o peso normal, caso queira mudar ou "
						+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");
			
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
						+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
						+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");
				
			}
			break;
		case 11:
			
			if(imcF < 14.60) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� abaixo do peso, caso queira mudar ou "
						+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");	
				
			} else if (imcF >= 14.60 && imcF <= 21.18) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com o peso normal, caso queira mudar ou "
						+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
						+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
						+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");				
			}
			break;
		case 12:
			
			if(imcF < 14.98) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� abaixo do peso, caso queira mudar ou "
						+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");	
				
			} else if (imcF >= 14.98 && imcF <= 22.17) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com o peso normal, caso queira mudar ou "
						+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
						+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
						+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");				
			}
			break;
		case 13:
			
			if(imcF < 15.36) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� abaixo do peso, caso queira mudar ou "
						+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 15.36 && imcF <= 23.08) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com o peso normal, caso queira mudar ou "
						+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
						+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
						+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");						
			}
			break;
		case 14:
			
			if(imcF < 15.67) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� abaixo do peso, caso queira mudar ou "
						+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 15.67 && imcF <= 23.88) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com o peso normal, caso queira mudar ou "
						+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
							
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
						+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
						+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");						
			}
			break;
		case 15:
			
			if(imcF < 16.01) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� abaixo do peso, caso queira mudar ou "
						+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 16.01 && imcF <= 24.29) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com o peso normal, caso queira mudar ou "
						+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
						+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
						+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");
			}
			break;
		case 16:
			
			if(imcF < 16.37) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� abaixo do peso, caso queira mudar ou "
						+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 16.37 && imcF <= 24.74) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com o peso normal, caso queira mudar ou "
						+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
						+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
						+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");				
			}
			break;
		case 17:
			
			if(imcF < 16.59) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� abaixo do peso, caso queira mudar ou "
						+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 16.59 && imcF <= 25.23) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com o peso normal, caso queira mudar ou "
						+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
						+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
						+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");					
			}
			break;
		case 18:
			
			if(imcF < 16.71) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� abaixo do peso, caso queira mudar ou "
						+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 16.71 && imcF <= 25.56) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com o peso normal, caso queira mudar ou "
						+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
				
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
						+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
						+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");					
			}
			break;
		case 19:
			
			if(imcF < 16.87) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� abaixo do peso, caso queira mudar ou "
						+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
				
			} else if (imcF >= 16.87 && imcF <= 25.85) {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com o peso normal, caso queira mudar ou "
						+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
						+ "							polichinelos ou pular corda ");	
							
			}else {
				JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcF + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
						+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
						+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");					
			}
			break;
			
			default: 
				
				JOptionPane.showMessageDialog(null,"O seu IMC �: "  + imcF + "\nN�o foi poss�vel realizar o c�lculo. " + "Entre novamente com o seu peso e altura.");
				
			break;
		}
		}
		
		public static void imcMasculino(double imcM, int idade) 
		{
			switch (idade) 
			{
			case 10:
				
				if(imcM < 14.42) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� abaixo do peso, caso queira mudar ou "
							+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
					
				} else if (imcM >= 14.42 && imcM <= 19.6) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com o peso normal, caso queira mudar ou "
							+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
							+ "							polichinelos ou pular corda ");	
					
				}else {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
							+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
							+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");						
				}
				break;
			case 11:
				
				if(imcM < 14.83) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� abaixo do peso, caso queira mudar ou "
							+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
					
				} else if (imcM >= 14.83 && imcM <= 20.35) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com o peso normal, caso queira mudar ou "
							+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
							+ "							polichinelos ou pular corda ");	
					
				}else {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
							+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
							+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");						
				}
				break;
			case 12:
				
				if(imcM < 15.24) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� abaixo do peso, caso queira mudar ou "
							+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
					
				} else if (imcM >= 15.24 && imcM <= 21.12) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com o peso normal, caso queira mudar ou "
							+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
							+ "							polichinelos ou pular corda ");	
					
				}else {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
							+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
							+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");						
				}
				break;
			case 13:
				
				if(imcM < 15.73) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� abaixo do peso, caso queira mudar ou "
							+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
					
				} else if (imcM >= 15.73 && imcM <= 21.93) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com o peso normal, caso queira mudar ou "
							+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
							+ "							polichinelos ou pular corda ");	
					
				}else {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
							+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
							+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");						
				}
				break;
			case 14:
				
				if(imcM < 16.18) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� abaixo do peso, caso queira mudar ou "
							+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
										
				} else if (imcM >= 16.18 && imcM <= 22.77) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com o peso normal, caso queira mudar ou "
							+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
							+ "							polichinelos ou pular corda ");	
									
				}else {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
							+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
							+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");						
				}
				break;
			case 15:
				
				if(imcM < 16.59) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� abaixo do peso, caso queira mudar ou "
							+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
										
				} else if (imcM >= 16.59 && imcM <= 23.63) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com o peso normal, caso queira mudar ou "
							+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
							+ "							polichinelos ou pular corda ");	
													
				}else {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
							+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
							+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");						
				}
				break;
			case 16:
				
				if(imcM < 17.01) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� abaixo do peso, caso queira mudar ou "
							+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
															
				} else if (imcM >= 17.01 && imcM <= 24.45) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com o peso normal, caso queira mudar ou "
							+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
							+ "							polichinelos ou pular corda ");	
																	
				}else {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
							+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
							+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");						
				}
				break;
			case 17:
				
				if(imcM < 17.31) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� abaixo do peso, caso queira mudar ou "
							+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
															
				} else if (imcM >= 17.31 && imcM <= 25.28) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com o peso normal, caso queira mudar ou "
							+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
							+ "							polichinelos ou pular corda ");	
																					
				}else {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
							+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
							+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");							
				}
				break;
			case 18:
				
				if(imcM < 17.54) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� abaixo do peso, caso queira mudar ou "
							+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
																				
				} else if (imcM >= 17.54 && imcM <= 25.95) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com o peso normal, caso queira mudar ou "
							+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
							+ "							polichinelos ou pular corda ");	
																							
				}else {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
							+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
							+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");							
				}
				break;
			case 19:
				
				if(imcM < 17.8) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� abaixo do peso, caso queira mudar ou "
							+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
																				
				} else if (imcM >= 17.8 && imcM <= 26.36) {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com o peso normal, caso queira mudar ou "
							+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
							+ "							polichinelos ou pular corda ");	
																						
				}else {
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcM + "\nVoc� est� com sobrepeso, isso pode ser prejudicial a sua sa�de, "
							+ "							� recomendavel que entre em contato com um profissinal de sa�de qualificado para orienta-lo sobre que medidas voc� deve tomar"
							+ "							se esse n�o for o seu caso e voc� deseja mudar, recomendamos que fa�a exerc�cios leves como caminha e polichinelo para melhorar o seu cardio");						
				}
				break;
				
				default: 
					
					JOptionPane.showMessageDialog(null,"O seu IMC �: "  + imcM + "\nN�o foi poss�vel realizar o c�lculo. " + "Entre novamente com o seu peso e altura.");
					
				break;
			}
			}
			
			public static void imcAdulto(double imcA) 
			{
			
				if(imcA < 18.5) 
			{
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcA + "\nVoc� est� abaixo do peso, caso queira mudar ou "
							+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar como mudar os seus habitos alimentares");			
					}
				if( imcA >= 18.5 && imcA <= 24.9) 
			{
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcA + "\nVoc� est� com o peso normal, mas quase queira mudar recomendados exerc�cios leves"
							+ 							"como caminhadas, corridas e polichinelos agora para "
							+ "							os familiarizados o BURPEE possui um set de exerc�cios mais intensos");
			}
				if( imcA >= 25.0 && imcA <= 29.9) 
			{
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcA + "\nVoc� est� com pr�-obesidade, isso pode levar a problemas de s�ude"
							+ "recomendamos que procure fazer exerc�cios leves como caminhada, polichinelos, pular corda e procure ajuda de um nutricionista para analisar seus habitos alimentares");					
			}
				if( imcA >= 30.0 && imcA <= 34.9) 
			{
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcA + "\nVoce est� com Grau 1 de obesidade, isso pode levar a problemas de sa�de"
							+ "recomendamos que procure realizar exerc�cios leves como caminhas, polichinelos, pular corda e procure ajuda de um nutricionista para analisar seus habitos alimentares");
					
			}
				if( imcA >= 35.0 && imcA <= 39.9) 
			{
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcA + "\nVoc� est� com Grau 2 de obesidade,  isso pode levar a problemas de sa�de "
							+ "					recomendamos que procure realizar exerc�cios leves como caminhas e/ou polichinelos e procure ajuda de um nutricionista para analisar seus habitos alimentares");
					
			}
				if( imcA >= 40) 
			{
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcA + "\nVoc� est� com Grau 3 de obesidade, isso pode afetar a sua sa�de de forma negativa, "
							+ "						recomendamos que procure um profissinal de sa�de para orienta��es mais completas ");						
			}
		 
		  }
			public static void imcIdoso(double imcI) 
			{
			
				if(imcI < 22.0) 
			{
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcI + "\nVoc� est� abaixo do peso, caso queira mudar ou "
							+ "						n�o se sinta confortavel com ele, procure um nutricionista para ele orientar novas habitos alimentares");
													}
				if( imcI >= 22.0 && imcI <= 27.0) 
			{
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcI + "\nVoc� est� com o peso normal, caso queira mudar ou "
							+ "							n�o est� confortavel com ele, voc� pode realizar exerc�cios leves, como caminhadas,"
							+ "							polichinelos ou pular corda ");	
					}
				if( imcI >= 28.0) 
			{
					JOptionPane.showMessageDialog(null, "O seu IMC �: " + imcI + "\nVoc� est� com pr�-obesidade, isso pode levar a problemas de s�ude"
							+ "recomendamos que procure fazer exerc�cios leves como caminhada, polichinelos, pular corda e procure ajuda de um nutricionista para analisar seus habitos alimentares");	
			}
		
	
	}

}
