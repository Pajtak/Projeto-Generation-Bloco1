package Codigos;

import java.util.Scanner;

public class IMCCodigo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double altura = 0.0, peso = 0.0, IMC = 0.0;
		
		System.out.println("Digite o seu peso: ");
		peso = leia.nextDouble();
		System.out.println("Digite a sua altura: ");
		altura = leia.nextDouble();
		
		IMC = ( peso / (altura * altura));
		System.out.println("O seu IMC �: " + IMC);
		
		if(IMC < 18.5) 
		{
			System.out.println("Voc� est� abaixo do peso:");
		}
		if(IMC >= 18.5 && IMC  <= 24.9) 
		{
			System.out.println("Voc� est� com o peso normal");
		}
		if(IMC >= 25.0 && IMC  <= 29.9) 
		{
			System.out.println("Voc� est� com o peso de Pr�-obesidade");
		}
		if(IMC >= 30.0 && IMC  <= 34.9) 
		{
			System.out.println("Voc� est� com Obesidade de Grau 1");
		}
		if(IMC >= 35.0 && IMC  <= 39.9) 
		{
			System.out.println("Voc� est� com Obesidade de Grau 2");
		}
		if(IMC >= 40) 
		{
			System.out.println("Voc� est� com Obesidade de Grau 3");
		}
	}

}
