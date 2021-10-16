package br.com.generation.projeto;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		PessoaCaracteristica pc = new PessoaCaracteristica();
		//In�cio do Programa
		pc.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		pc.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));		
		pc.setSexo(JOptionPane.showInputDialog("Digite seu sexo:\n [M] ou [F]"));
		pc.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: ")));
		pc.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: ")));
		
		/*JOptionPane.showMessageDialog(null, "DADOS DO USU�RIO\n\nNome: " + pc.getNome() + 
					"\nIdade: " + pc.getIdade() + 
					"\nSexo: " + pc.getSexo() + 
					"\nAltura: " + pc.getAltura() + 
					"\nPeso: " + pc.getPeso());*/
		
		//System.out.println("Voc� deseja calcular o seu IMC");
		
		//teste do IMC - obs: n�o se encaixa no teste para gestantes ou crian�as abaixo de 10 anos
		
		//Aviso sobre o c�lculo de IMC
		JOptionPane.showMessageDialog(null, "Aten��o!!!\n\n" + 
					"O c�lculo feito no sistema n�o se\n" + 
					"encaixa no teste para gestantes, nem\n" + 
					"para crian�as abaixo de 10 anos.\n\n ", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		
		//C�lculo de IMC
		Imc.validacaoIdade(pc.getIdade(), pc.getPeso(), pc.getAltura(), pc.getSexo());
		//Question�rio de Dieta
		Dieta.resultado(Dieta.somaPontos(Dieta.perguntas()));
		//Informa��es sobre cl�nicas de Nutri��o perto dos bairros cobertos
		Bairro.GetBairro(args, args);
		
		
	}

}
