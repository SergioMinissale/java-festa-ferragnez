package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		System.out.print("Buonasera, mi puoi dire il tuo nome?: ");
		String persona = scanner.nextLine();
		
		boolean eccoti = false;
	    
		//visto che la condizione è falsa entro dentro al for
		for(int i = 0; i < listaInvitati.length ; i++ ) {
			
			if(persona.equals(listaInvitati[i])) {
				eccoti = true;
				System.out.println("Prego " + persona + " puoi entrare alla festa, buon divertimento!");
				break;
			}
			
			
			}
			if(!eccoti) {
				System.out.println("Mi dispiace " + persona + " ma non sei nella lista, non puoi entrare!");
		}
		 
		
		
		scanner.close();
	}

}
