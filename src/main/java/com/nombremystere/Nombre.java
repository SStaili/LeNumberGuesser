package com.nombremystere;

import java.util.Random;

import java.util.Scanner;

public class Nombre {
	
	Random random = new Random();
	
	int r = random.nextInt(10);
	
	public void nombre() {
		System.out.println("Saisi nombre");
		Scanner sc = new Scanner (System.in);
		int nombre = sc.nextInt();
		System.out.println("Vous avez saisi: " + nombre);
		
	}
	
	public void guestnombre() {
		
		System.out.println("Devinez le chiffre: ");
		Scanner sc = new Scanner (System.in);
		int nombre = sc.nextInt();
		int i = 0;
		
<<<<<<< HEAD
		
=======
<<<<<<< HEAD
		
=======
>>>>>>> 8381ac8e476886172ac0e377dc8436a5df4ee1ee
>>>>>>> 26462e76d5ec13b11959b7c07d41b436249c0992
			while(i <= 10) {
				
			
				
				System.out.println("Vous avez saisi: " + nombre);
				
				if(nombre < r) {
					
					System.out.println("+" );
					nombre = sc.nextInt();
					i++;
					
				} else if (nombre > r) {
					System.out.println("-");
					nombre = sc.nextInt();
					i++;
				}else if (nombre == r){
					System.out.println("Vous avez trouvé le nombre mystère " + r);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 26462e76d5ec13b11959b7c07d41b436249c0992
					break;
				
				}
				
				if ( i == 10){
<<<<<<< HEAD

					System.out.println("Vous avez perdu");
				
				}
							
			}
		
		
		
		
		
	
		
		
	}
}
