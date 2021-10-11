package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Imc {
	
	
	static void validacaoIdade(int idade) {
		
		while(idade < 10) {
			JOptionPane.showMessageDialog(null, "A idade não é válida para o cálculo de IMC.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade acima de 10 anos: "));
		}
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog(
				"Digite o seu peso (em kg): \n(utilize o ponto ao invés da vírgula)\n "));
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog(
				"Digite a sua altura (em metros): \n(utilize o ponto ao invés da vírgula)\n "));
		
		calculoPorIdade(idade, peso, altura);
	}
	
	static void calculoPorIdade(int idade, double peso, double altura) {
		
		String sexo;
		
		if(idade >= 10 && idade <= 19) {
			
			sexo = JOptionPane.showInputDialog("Digite seu sexo:\n\n(Escolha entre F ou M)\n ");
			
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
		
		double imc = p/(a*a);
		
		switch(idade) {
			case 10:
				if(imc < 14.23) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 14.23 && imc <= 20.19) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 11:
				if(imc < 14.60) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 14.60 && imc <= 21.18) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 12:
				if(imc < 14.98) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 14.98 && imc <= 22.17) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 13:
				if(imc < 15.36) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 15.36 && imc <= 23.08) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 14:
				if(imc < 15.67) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 15.67 && imc <= 23.88) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 15:
				if(imc < 16.01) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 16.01 && imc <= 24.29) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 16:
				if(imc < 16.37) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 16.37 && imc <= 24.74) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 17:
				if(imc < 16.59) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 16.59 && imc <= 25.23) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 18:
				if(imc < 16.71) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 16.71 && imc <= 25.56) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 19:
				if(imc < 16.87) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 16.87 && imc <= 25.85) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			default:
				JOptionPane.showMessageDialog(null,
						"O seu IMC é: " + imc + "\n\nNão foi possível realizar o cálculo.\n ", "Aviso",
						JOptionPane.INFORMATION_MESSAGE);
				break;
		}
		// https://www.calcule.net/saude/tabela-imc/#tabela-imc-feminino
	}
	
	static void calcularImcAdolecM(int idade, double p, double a) { // calculo para crianças adolescentes masculino de 10 a 19 anos
		
		double imc = p/(a*a);
		
		switch(idade) {
			case 10:
				if(imc < 14.42) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 14.42 && imc <= 19.6) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 11:
				if(imc < 14.83) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 14.83 && imc <= 20.35) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 12:
				if(imc < 15.24) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 15.24 && imc <= 21.12) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 13:
				if(imc < 15.73) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 15.73 && imc <= 21.93) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 14:
				if(imc < 16.18) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 16.18 && imc <= 22.77) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 15:
				if(imc < 16.59) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 16.59 && imc <= 23.63) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 16:
				if(imc < 17.01) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 17.01 && imc <= 24.45) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 17:
				if(imc < 17.31) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 17.31 && imc <= 25.28) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 18:
				if(imc < 17.54) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 17.54 && imc <= 25.95) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 19:
				if(imc < 17.8) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else if(imc >= 17.8 && imc <= 26.36) {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			default:
				JOptionPane.showMessageDialog(null,
						"O seu IMC é: " + imc + "\n\nNão foi possível realizar o cálculo.\n ", "Aviso",
						JOptionPane.INFORMATION_MESSAGE);
				break;
		}
		// https://www.calcule.net/saude/tabela-imc/#tabela-imc-masculino
	}
		
	static void calcularImcAdulto(double p, double a) { //calculo do imc para adultos de 20 a 59 anos
		
		double imc = p/(a*a);
		
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null,
					"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		} else if(imc >= 18.5 && imc <= 24.9) {
			JOptionPane.showMessageDialog(null,
					"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		} else if(imc >= 25.0 && imc <= 29.9) {
			JOptionPane.showMessageDialog(null,
					"O seu IMC é: " + imc + "\n\nVocê está na pré-obesidade.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		} else if(imc >= 30.0 && imc <= 34.9) {
			JOptionPane.showMessageDialog(null,
					"O seu IMC é: " + imc + "\n\nVocê está com obesidade grau 1.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		} else if(imc >= 35.0 && imc <= 39.9) {
			JOptionPane.showMessageDialog(null,
					"O seu IMC é: " + imc + "\n\nVocê está com obesidade grau 2.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		} else {
			JOptionPane.showMessageDialog(null,
					"O seu IMC é: " + imc + "\n\nVocê está com obesidade grau 3.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		}
		//referencia https://abeso.org.br/obesidade-e-sindrome-metabolica/calculadora-imc/
	}
	
	static void calcularImcIdoso(double p, double a) { // cálculo para idosos, idade igual ou acima de 60 anos
		
		double imc = p/(a*a);
		
		if (imc <= 22.0) {
			JOptionPane.showMessageDialog(null,
					"O seu IMC é: " + imc + "\n\nVocê está abaixo do peso.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		} else if(imc > 22.0 && imc < 27.0) {
			JOptionPane.showMessageDialog(null,
					"O seu IMC é: " + imc + "\n\nVocê está com o peso normal.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		} else {
			JOptionPane.showMessageDialog(null,
					"O seu IMC é: " + imc + "\n\nVocê está com sobrepeso.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		}		
		//https://bvsms.saude.gov.br/bvs/publicacoes/orientacoes_coleta_analise_dados_antropometricos.pdf
	}
	
}
