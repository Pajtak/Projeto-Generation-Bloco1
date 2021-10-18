package br.com.generation.projeto;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class Bairro {
	
	
   

	private Map<String, List<String>> end = new HashMap<String, List<String>>();

	public Bairro(){
	List<String> tatuapeList = new ArrayList<String>();
	tatuapeList.add("Nutriclin|| Endere�o: Rua Apucarana, 326. Telefone: (11) 3798-2829");
	tatuapeList.add("Cl�nica Equil�brio Nutricional || Endere�o: Pra�a S�lvio Romero, 55 - sala 67. Telefone: (11) 2672-7300");
	tatuapeList.add("SF Nutri��o || Endere�o: R. Itapura, 300 - Conjunto 1302. Telefone: (11) 3713-2023");
	tatuapeList.add("CliNutri || Endere�o: Rua Doutor Corinto Baldoino Costa, 74. Telefone: (11) 98224-6063");
	tatuapeList.add("NutreCl�nica || Endere�o: R. Restinga, 113 - conjunto 305. Telefone: (11) 4114-9305");
	end.put("Tatuap�", tatuapeList);
	List<String> vilaCarraoList = new ArrayList<String>();
	vilaCarraoList.add("Nutricionista Dra. Brenda Berlla || Endere�o: Av. Conselheiro Carr�o, 2620 - sala 1203. Telefone: (11) 98420-1266");
	vilaCarraoList.add("Clinica Bio Ser || Endere�o: Av. Conselheiro Carr�o, 2939. Telefone: (11)2098-2971");
	vilaCarraoList.add("Nutricionista Dra. Renata Giudice || Endere�o: Av. Guilherme Giorgi, 374. Telefone: (11) 99246-3632");
	vilaCarraoList.add("Evs - Espa�o Vida Saud�vel || Endere�o: Av. Conselheiro Carr�o, 1857 - Sala 2. Telefone: (11) 97404-2367");
	end.put("Vila Carr�o", vilaCarraoList);
	List<String> belemList = new ArrayList<String>();
	belemList.add("Phillipe Rios - Nutricionista Esporte e Est�tica || Endere�o: Rua Serra da Bocaina, 570 - Cj 41. Telefone: (11) 95892-8819");
	belemList.add("Herba Sa�de Nutricional || Endere�o: Av. Celso Garcia, 1907. Telefone: (11) 97952-8499");
	end.put("Bel�m", belemList);
	List<String> moocaList = new ArrayList<String>();
	moocaList.add("Espa�o Sa�de � Vida || Endere�o: R. Canuto Saraiva, 59. Telefone: (11) 98707-8323");
	moocaList.add("NutriMente Psicologia, Neuropsicologia e Nutri��o || Endere�o: R. da Mooca, 2343 - Sala 1. Telefone: (11) 99515-3854");
	moocaList.add("Andr�ia Rodrigues - Nutri��o Esportiva || Endere�o: Rua Cam�, 532. Telefone: (11) 98876-3513");
	moocaList.add("Tha�s Pereira - Nutricionista Esportiva || Endere�o: Rua Celso de Azevedo Marques, 395. Telefone: (11) 98488-0651");
	moocaList.add("Bella Nutri - Nutri��o & Est�tica || Endere�o: Edif�cio Atrio Giorno - R. Borges de Figueiredo, 303 - Sala 609. Telefone: (11) 97457-4199");
	end.put("Mooca", moocaList);
	}
	 public Map<String, List<String>> getEnd() {
			return end;
		}
	 public static void GetBairro(String[] args) {
		boolean terminar = false;
		/*String[] options2 = {"Sim", "N�o"};
		String n2 = (String)JOptionPane.showInputDialog(null, "Voc� deseja procurar ajuda profissional? Se sim, o MANJARVA indicar� Cl�nicas de Nutri��o nos bairros que cobrimos.", 
			            "OP��ES", JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
		if (n2 == "N�o") {
			JOptionPane.showMessageDialog(null, "OBRIGADO POR UTILIZAR O MANJARVA! VOLTE SEMPRE!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			terminar = true;
		}
		else {*/
		while (!terminar) {
		Bairro bairros = new Bairro();
		Object[] options = {"Tatuap�", "Bel�m", "Mooca", "Vila Carr�o"};
		String n = (String)JOptionPane.showInputDialog(null, "Escolha um dos bairros cobertos pelo aplicativo:", 
		            "Bairros", JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
		List<String> resultado = bairros.getEnd().get(n);
				
		if (resultado == null) {
		JOptionPane.showMessageDialog(null, "O resultado n�o foi encontrado, por favor escolha um dos bairros cobertos pelo aplicativo: ", "AVISO", JOptionPane.INFORMATION_MESSAGE);
					}
		else {
			for (String obj: resultado) {
			JOptionPane.showMessageDialog(null, obj, "CLIN�CAS DISPON�VEIS EM ", JOptionPane.INFORMATION_MESSAGE);}
			JOptionPane.showMessageDialog(null, "OBRIGADO POR UTILIZAR O MANJARVA! VOLTE SEMPRE!", "AVISO", JOptionPane.INFORMATION_MESSAGE);		
			terminar = true;}}}}

