package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//teste do IMC - obs: não se encaixa no teste para gestantes ou crianças abaixo de 10 anos
		JOptionPane.showMessageDialog(null, "Atenção!!!\n\n" + 
											"O cálculo feito no sistema não se\n" + 
											"encaixa no teste para gestantes, nem\n" + 
											"para crianças abaixo de 10 anos.\n\n ", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));		
		Imc.validacaoIdade(idade);
		
		
	}
	
}
