package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//teste do IMC
		double peso = Double.parseDouble(JOptionPane.showInputDialog(
				"Digite o seu peso (em kg): \n(utilize o ponto ao inv�s da v�rgula)\n "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(
				"Digite a sua altura (em metros): \n(utilize o ponto ao inv�s da v�rgula)\n "));
		
		Imc.calcularImc(peso, altura);
		
	}

}
