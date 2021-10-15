package br.com.generation.projeto;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		PessoaCaracteristica pc = new PessoaCaracteristica();
		
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
		JOptionPane.showMessageDialog(null, "Atenção!!!\n\n" + 
					"O cálculo feito no sistema não se\n" + 
					"encaixa no teste para gestantes, nem\n" + 
					"para crianças abaixo de 10 anos.\n\n ", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		
		
		Imc.validacaoIdade(pc.getIdade(), pc.getPeso(), pc.getAltura(), pc.getSexo());
		
		Dieta.resultado(Dieta.somaPontos(Dieta.perguntas()));
		
		boolean terminar = false;
		while (!terminar) {
		String bairro;
		Scanner scanner = new Scanner(System.in);
		Bairro bairros = new Bairro();
		bairro = scanner.nextLine();
		List<String> resultado = bairros.getEnd().get(bairro);
		
		if (resultado == null) {
			System.out.println("O resultado não foi encontrado, por favor digite um dos bairros cobertos pelo aplicativo: ");
			}
		else {
			for (String obj: resultado) {
			System.out.println(obj);
			}
			terminar = true;
		
		
		scanner.close();
		}
	}
		
		
	}

}
