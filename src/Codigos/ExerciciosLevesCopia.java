package Codigos;

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
				System.out.println("O seu IMC é: " + imcF + "\nVocê está abaixo do peso. " + "Melhore a sua alimentação");
				
			} else if (imcF >= 14.23 && imcF <= 20.19) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com o peso normal. " + "Continue assim!!!");
			
			}else {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
				
			}
			break;
		case 11:
			
			if(imcF < 14.60) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está abaixo do peso. " + "Melhore a sua alimentação");
				
			} else if (imcF >= 14.60 && imcF <= 21.18) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com o peso normal. " + "Continue assim!!!");
			
			}else {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
				
			}
			break;
		case 12:
			
			if(imcF < 14.98) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está abaixo do peso. " + "Melhore a sua alimentação");
				
			} else if (imcF >= 14.98 && imcF <= 22.17) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com o peso normal. " + "Continue assim!!!");
			
			}else {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
				
			}
			break;
		case 13:
			
			if(imcF < 15.36) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está abaixo do peso. " + "Melhore a sua alimentação");
				
			} else if (imcF >= 15.36 && imcF <= 23.08) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com o peso normal. " + "Continue assim!!!");
			
			}else {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
				
			}
			break;
		case 14:
			
			if(imcF < 15.67) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está abaixo do peso. " + "Melhore a sua alimentação");
				
			} else if (imcF >= 15.67 && imcF <= 23.88) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com o peso normal. " + "Continue assim!!!");
			
			}else {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
				
			}
			break;
		case 15:
			
			if(imcF < 16.01) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está abaixo do peso. " + "Melhore a sua alimentação");
				
			} else if (imcF >= 16.01 && imcF <= 24.29) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com o peso normal. " + "Continue assim!!!");
			
			}else {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
				
			}
			break;
		case 16:
			
			if(imcF < 16.37) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está abaixo do peso. " + "Melhore a sua alimentação");
				
			} else if (imcF >= 16.37 && imcF <= 24.74) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com o peso normal. " + "Continue assim!!!");
			
			}else {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
				
			}
			break;
		case 17:
			
			if(imcF < 16.59) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está abixo do peso. " + "Melhore a sua alimentação");
				
			} else if (imcF >= 16.59 && imcF <= 25.23) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com o peso normal. " + "Continue assim!!!");
			
			}else {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
				
			}
			break;
		case 18:
			
			if(imcF < 16.71) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está abixo do peso. " + "Melhore a sua alimentação");
				
			} else if (imcF >= 16.71 && imcF <= 25.56) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com o peso normal. " + "Continue assim!!!");
			
			}else {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
				
			}
			break;
		case 19:
			
			if(imcF < 16.87) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está abixo do peso. " + "Melhore a sua alimentação");
				
			} else if (imcF >= 16.87 && imcF <= 25.85) {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com o peso normal. " + "Continue assim!!!");
			
			}else {
				System.out.println("O seu IMC é: " + imcF + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
				
			}
			break;
			
			default: 
				
				System.out.println("O seu IMC é: "  + imcF + "\nNão foi possível realizar o cálculo. " + "Entre novamente com o seu peso e altura.");
				
			break;
		}
		}
		
		public static void imcMasculino(double imcM, int idade) 
		{
			switch (idade) 
			{
			case 10:
				
				if(imcM < 14.42) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está abixo do peso. " + "Melhore a sua alimentação");
					
				} else if (imcM >= 14.42 && imcM <= 19.6) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com o peso normal. " + "Continue assim!!!");
				
				}else {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
					
				}
				break;
			case 11:
				
				if(imcM < 14.83) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está abixo do peso. " + "Melhore a sua alimentação");
					
				} else if (imcM >= 14.83 && imcM <= 20.35) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com o peso normal. " + "Continue assim!!!");
				
				}else {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
					
				}
				break;
			case 12:
				
				if(imcM < 15.24) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está abixo do peso. " + "Melhore a sua alimentação");
					
				} else if (imcM >= 15.24 && imcM <= 21.12) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com o peso normal. " + "Continue assim!!!");
				
				}else {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
					
				}
				break;
			case 13:
				
				if(imcM < 15.73) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está abixo do peso. " + "Melhore a sua alimentação");
					
				} else if (imcM >= 15.73 && imcM <= 21.93) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com o peso normal. " + "Continue assim!!!");
				
				}else {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
					
				}
				break;
			case 14:
				
				if(imcM < 16.18) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está abixo do peso. " + "Melhore a sua alimentação");
					
				} else if (imcM >= 16.18 && imcM <= 22.77) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com o peso normal. " + "Continue assim!!!");
				
				}else {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
					
				}
				break;
			case 15:
				
				if(imcM < 16.59) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está abixo do peso. " + "Melhore a sua alimentação");
					
				} else if (imcM >= 16.59 && imcM <= 23.63) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com o peso normal. " + "Continue assim!!!");
				
				}else {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
					
				}
				break;
			case 16:
				
				if(imcM < 17.01) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está abixo do peso. " + "Melhore a sua alimentação");
					
				} else if (imcM >= 17.01 && imcM <= 24.45) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com o peso normal. " + "Continue assim!!!");
				
				}else {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
					
				}
				break;
			case 17:
				
				if(imcM < 17.31) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está abixo do peso. " + "Melhore a sua alimentação");
					
				} else if (imcM >= 17.31 && imcM <= 25.28) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com o peso normal. " + "Continue assim!!!");
				
				}else {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
					
				}
				break;
			case 18:
				
				if(imcM < 17.54) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está abixo do peso. " + "Melhore a sua alimentação");
					
				} else if (imcM >= 17.54 && imcM <= 25.95) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com o peso normal. " + "Continue assim!!!");
				
				}else {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
					
				}
				break;
			case 19:
				
				if(imcM < 17.8) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está abixo do peso. " + "Melhore a sua alimentação");
					
				} else if (imcM >= 17.8 && imcM <= 26.36) {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com o peso normal. " + "Continue assim!!!");
				
				}else {
					System.out.println("O seu IMC é: " + imcM + "\nVocê está com sobrepeso." + "Melhore a sua alimentação, começe a fazer exercícios leves como caminhadas e procure a ajuda de um nutricionista");
					
				}
				break;
				
				default: 
					
					System.out.println("O seu IMC é: "  + imcM + "\nNão foi possível realizar o cálculo. " + "Entre novamente com o seu peso e altura.");
					
				break;
			}
			}
			
			public static void imcAdulto(double imcA) 
			{
			
				if(imcA < 18.5) 
			{
					System.out.println("Você está abaixo do peso melhore a sua alimentação: ");
			}
				if( imcA >= 18.5 && imcA <= 24.9) 
			{
					System.out.println("Você está com o peso normal, continue assim : ");
			}
				if( imcA >= 25.0 && imcA <= 29.9) 
			{
					System.out.println("Você está com o peso de pré-obesidade : ");
					
					System.out.println("É recomendado que você faça exercícios leves como caminhada, corrida e melhore a sua alimentação");
			}
				if( imcA >= 30.0 && imcA <= 34.9) 
			{
					System.out.println("Você está com Grau 1 de obesidade!!! ");
					
					System.out.println("Começe a fazer exercícios leves como caminhada, corrida, pular corda "
							+ "e polichinelo, melhore a sua alimentação com o teste a seguir");
			}
				if( imcA >= 35.0 && imcA <= 39.9) 
			{
					System.out.println("Você está com Grau 2 de obesidade!!! ");
					
					System.out.println("Procura ajuda medica para revisar o seus hábitos alimentares "
										+ "e procurar realizar atividades físicas");
			}
				if( imcA >= 40) 
			{
						System.out.println("Você está com Grau 3 de obesidade!!!");
						
						System.out.println("Procure ajuda médica imediatamente");
			}
		 
		  }
			public static void imcIdoso(double imcI) 
			{
			
				if(imcI < 22.0) 
			{
					System.out.println("Você está abaixo do peso melhore a sua alimentação: ");
			}
				if( imcI >= 22.0 && imcI <= 27.0) 
			{
					System.out.println("Você está com o peso normal, continue assim : ");
			}
				if( imcI >= 28.0) 
			{
					System.out.println("Você está com o peso de pré-obesidade : ");
					System.out.println("É recomendado que você faça exercícios leves como caminhada, corrida e melhore a sua alimentação");
			}
		
	
	}

}
