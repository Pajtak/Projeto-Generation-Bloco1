package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//teste do IMC - obs: n�o se encaixa no teste para gestantes ou crian�as abaixo de 10 anos
		JOptionPane.showMessageDialog(null, "Aten��o!!!\n\n" + 
											"O c�lculo feito no sistema n�o se\n" + 
											"encaixa no teste para gestantes, nem\n" + 
											"para crian�as abaixo de 10 anos.\n\n ", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));		
		Imc.validacaoIdade(idade);
		
		
	}
	
}
