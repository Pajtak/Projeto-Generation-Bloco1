package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Imc {
	
	
	//falta fazer o calculo para crian�as e adolescentes
	
	
	//calculo do imc para adultos de 20 a 59 anos
	
	static void calcularImc(double p, double a) { 
		
		double imc = p/(a*a);
		
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null,
					"O seu IMC �: " + imc + "\n\nVoc� est� abaixo do peso.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		} else if(imc >= 18.5 && imc <= 24.9) {
			JOptionPane.showMessageDialog(null,
					"O seu IMC �: " + imc + "\n\nVoc� est� com o peso normal.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		} else if(imc >= 25.0 && imc <= 29.9) {
			JOptionPane.showMessageDialog(null,
					"O seu IMC �: " + imc + "\n\nVoc� est� na pr�-obesidade.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		} else if(imc >= 30.0 && imc <= 34.9) {
			JOptionPane.showMessageDialog(null,
					"O seu IMC �: " + imc + "\n\nVoc� est� com obesidade grau 1.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		} else if(imc >= 35.0 && imc <= 39.9) {
			JOptionPane.showMessageDialog(null,
					"O seu IMC �: " + imc + "\n\nVoc� est� com obesidade grau 2.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		} else {
			JOptionPane.showMessageDialog(null,
					"O seu IMC �: " + imc + "\n\nVoc� est� com obesidade grau 3.\n ", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}

}
