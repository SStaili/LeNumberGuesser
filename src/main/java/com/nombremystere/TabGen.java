package com.nombremystere;

import java.util.ArrayList;
import java.util.Scanner;

public class TabGen {
	
	

	public void Generer () {
				
		 ArrayList <Integer> tabs = new ArrayList <Integer> (4);
	        int length = 0;
	 
	        while (length < 4)
	        {
	            int n = (int) (Math.random() * 10);
	            
	            tabs.add(n);
	            length += 1;
	        }
	 
	        for (int i=0; i<4; i++) {
	        	System.out.print(tabs.get(i));
	        }   
	        
	        	

	}

	
	
	public  void remplirTableau(int [] nombre) {
		Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int valeur = 1;
       
        
        for(int j = 0; j < 4; j++) {
        	nombre[j] = valeur ++;
        }
        
        for(int j = 0; j < 4; j++) {
			System.out.print(nombre[j]);
		}
        
   
        
	}
	
	public void Comparer() {
		System.out.println("Saisi nombre");
		int [] nombre = new int[4];
		remplirTableau(nombre);
		Generer();
		
		int a = nombre[0];
		int b = nombre[1];
		int c = nombre[2];
		int d = nombre[3];
		
	

	}
	
	
	
	

}
