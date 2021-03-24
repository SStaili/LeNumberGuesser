package com.nombremystere;
import java.util.Scanner;

public class Nombre {
	
	//Random random = new Random();
	
	//int r = random.nextInt(10);
	
	//public void nombre() {
		//System.out.println("Saisi nombre");
		//Scanner sc = new Scanner (System.in);
		//int nombre = sc.nextInt();
		//System.out.println("Vous avez saisi: " + nombre);
		
	//}
	
	public void guestnombre() {
		
		System.out.println("Devinez le chiffre: ");
		Scanner sc = new Scanner (System.in);
		int nombre = sc.nextInt();
		int i = 0;
		
			while(i <= 10) {
				
			
				
				System.out.println("Vous avez saisi: " + nombre);
				
				if(nombre < n) {
					
					System.out.println("+" );
					nombre = sc.nextInt();
					i++;
					
				} else if (nombre > r) {
					System.out.println("-");
					nombre = sc.nextInt();
					i++;
				}else if (nombre == r){
					System.out.println("Vous avez trouvé le nombre mystère " + r);
					break;
				
				}
				
				if ( i == 10){

					System.out.println("Vous avez perdu");
				
				}
							
			}
	}
}
