package Pessoas;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
				
		PessoaCaracteristica pc = new PessoaCaracteristica();
		
		pc.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		pc.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
		pc.setSexo(JOptionPane.showInputDialog("Digite seu sexo:\n [M] ou [F]"));
		pc.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: ")));
		pc.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: ")));
		pc.setEndereco(JOptionPane.showInputDialog("Digite seu endere�o: "));
		
		System.out.println("O nome do usu�rio �: " + pc.getNome());
		System.out.println("A idade do usu�rio �: " + pc.getIdade());
        System.out.println("O sexo do usu�rio �: " + pc.getSexo());
        System.out.println("A altura do usu�rio �: " + pc.getAltura());
        System.out.println("O peso do usu�rio �: " + pc.getPeso());
        System.out.println("O endere�o do usu�rio �: " + pc.getEndereco());
        
        
	}

}
