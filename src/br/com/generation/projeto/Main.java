package br.com.generation.projeto;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		PessoaCaracteristica pc = new PessoaCaracteristica();
		//Início do Programa
		pc.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		pc.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));		
		pc.setSexo(JOptionPane.showInputDialog("Digite seu sexo:\n [M] ou [F]"));
		pc.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: ")));
		pc.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: ")));
		
		/*JOptionPane.showMessageDialog(null, "DADOS DO USUÁRIO\n\nNome: " + pc.getNome() + 
					"\nIdade: " + pc.getIdade() + 
					"\nSexo: " + pc.getSexo() + 
					"\nAltura: " + pc.getAltura() + 
					"\nPeso: " + pc.getPeso());*/
		
		//System.out.println("Você deseja calcular o seu IMC");
		
		//teste do IMC - obs: não se encaixa no teste para gestantes ou crianças abaixo de 10 anos
		
		//Aviso sobre o cálculo de IMC
		JOptionPane.showMessageDialog(null, "Atenção!!!\n\n" + 
					"O cálculo feito no sistema não se\n" + 
					"encaixa no teste para gestantes, nem\n" + 
					"para crianças abaixo de 10 anos.\n\n ", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		
		//Cálculo de IMC
		Imc.validacaoIdade(pc.getIdade(), pc.getPeso(), pc.getAltura(), pc.getSexo());
		//Questionário de Dieta
		Dieta.resultado(Dieta.somaPontos(Dieta.perguntas()));
		//Informações sobre clínicas de Nutrição perto dos bairros cobertos
		Bairro.GetBairro(args, args);
		
		
	}

}
