package Codigos;

public class Exerc�cosLeves {

	public static void main(String [] args) {
		
		double imc = 21.18;
		
		
		dicasExerciciosAdulto(imc);
	}
	
	public static void dicasExerciciosF(double imc) 
	{
		
		int idade = 0;
		if(imc < 14.23 && idade == 10) {
			
			System.out.println("O seu IMC �: " + imc + "Voc� est� abaixo do peso." + "Aviso");
			
		}else if(imc >= 14.23 && imc <= 20.19) {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� com o peso normal. " + "Aviso");
			
		}else {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� com sobrepeso." + "Aviso");
}
	
		if(imc < 14.60) {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� abaixo do peso. " + "Aviso");
			
		}else if(imc >= 14.60 && imc <= 21.18) {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� com o peso normal. " + "Aviso");
		}else {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� com sobrepeso. " + "Aviso");
}
		if(imc < 14.98) {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� abaixo do peso. " + "Aviso");
			
		}else if(imc >= 14.98 && imc <= 22.17) {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� com o peso normal." + "Aviso");
			
		}else {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� com sobrepeso." + "Aviso");
}
		if(imc < 15.36) {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� abaixo do peso. " + "Aviso");
			
		}else if(imc >= 15.36 && imc <= 23.08) {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� com o peso normal. " + "Aviso");
			
		}else {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� com sobrepeso. " + "Aviso");
	
}
		if(imc < 15.67) {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� abaixo do peso. " + "Aviso");
			
		}else if(imc >= 15.67 && imc <= 23.88) {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� com o peso normal. " + "Aviso");
			
		}else {
			
			System.out.println("O seu IMC �: " + imc + "Voc� est� com sobrepeso. " + "Aviso");
			
}
		if(imc < 16.01) {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� abaixo do peso. " + "Aviso");
			
		}else if(imc >= 16.01 && imc <= 24.29) {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� com o peso normal." + "Aviso");
			
		}else {
	
			System.out.println("O seu IMC �: " + imc + "Voc� est� com sobrepeso." + "Aviso");
}
	}
	
	public static void dicasExerciciosAdulto(double imc) 
	{
	
		if(imc < 18.5) 
	{
			System.out.println("Voc� est� abaixo do peso melhore a sua alimenta��o: ");
	}
		if( imc >= 18.5 && imc <= 24.9) 
	{
			System.out.println("Voc� est� com o peso normal, continue assim : ");
	}
		if( imc >= 25.0 && imc <= 29.9) 
	{
			System.out.println("Voc� est� com o peso de pr�-obesidade : ");
			
			System.out.println("� recomendado que voc� fa�a exerc�cios leves como caminhada, corrida e melhore a sua alimenta��o");
	}
		if( imc >= 30.0 && imc <= 34.9) 
	{
			System.out.println("Voc� est� com Grau 1 de obesidade!!! ");
			
			System.out.println("Come�e a fazer exerc�cios leves como caminhada, corrida, pular corda "
					+ "e polichinelo, melhore a sua alimenta��o com o teste a seguir");
	}
		if( imc >= 35.0 && imc <= 39.9) 
	{
			System.out.println("Voc� est� com Grau 2 de obesidade!!! ");
			
			System.out.println("Procura ajuda medica para revisar o seus h�bitos alimentares "
								+ "e procurar realizar atividades f�sicas");
	}
		if( imc >= 40) 
	{
				System.out.println("Voc� est� com Grau 3 de obesidade!!!!!!!!!!! ");
				
				System.out.println("Procure ajuda m�dica imediatamente!!!!");
	}
 
  }
	public static void dicasExerciciosIdoso(double imc) 
	{
	
		if(imc < 22.0) 
	{
			System.out.println("Voc� est� abaixo do peso melhore a sua alimenta��o: ");
	}
		if( imc >= 22.0 && imc <= 27.0) 
	{
			System.out.println("Voc� est� com o peso normal, continue assim : ");
	}
		if( imc >= 28.0) 
	{
			System.out.println("Voc� est� com o peso de pr�-obesidade : ");
			System.out.println("� recomendado que voc� fa�a exerc�cios leves como caminhada, corrida e melhore a sua alimenta��o");
	}
		
	}
}
