package com.nombremystere;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		Nombre n = new Nombre();
		n.Generer();
		String resultat = new String();
		
		do {
			System.out.println("1. Deviner un nombre");
			System.out.println("2. Challenge IA");
			System.out.println("3. Quitter l'application");
			
			
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				n.GuessNombre();
				break;
			case 2:
				n.GuessNombre();
				break;
			
			}
			
		}while(choice != 3);
		
		System.out.println("Fin du programme");
	}

	
}
