package com.nombremystere;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import java.util.Scanner;

public class Nombre {
	
	
	private  ArrayList <Integer> tab;
	
	private ArrayList <Integer> nombre;
	
	
		
		
		

	public void Generer () {
		
		 ArrayList <Integer> tab = new ArrayList <Integer> (4);
	        int length = 0;
	 
	        while (length < 4)
	        {
	            int n = (int) (Math.random() * 10);
	            
	            tab.add(n);
	            length += 1;
	        }
	 
	        for (int i=0; i<4; i++) {
	        	System.out.print(tab.get(i));
	        }   
	        
	        this.tab = tab;
	        	

	}
	
	public  void remplirTableau() {
		Scanner sc = new Scanner(System.in);
		 ArrayList <Integer> nombre = new ArrayList <Integer> (4);
		 String n = sc.nextLine();
        
        for(int j = 0; j < 4; j++) {
        	
        	nombre.add((int)n.charAt(j));
        	
        	
        }
        
        
         this.nombre = nombre;
         
        
	}
	
	public void Comparer() {
		System.out.println("Saisi nombre");
		System.out.println(this.tab);
		this.remplirTableau();
		System.out.println(this.nombre);
		
		
		String resultat = new String();
		
		for(int i = 0; i < 4; i++) {
			if(this.tab.get(i) < this.nombre.get(i)) {
				
				resultat += '+';
				
			}
			else if(this.tab.get(i) > this.nombre.get(i)) {
				resultat += '-';
				
			}
			else if(this.tab.get(i) == this.nombre.get(i)) {
				resultat += '=';
				
			}
			
		}
		System.out.println(resultat + '\n');
		
		
		
		
		
		
	
		
		
		
	}

	public ArrayList <Integer> getTab() {
		return tab;
	}

	public void setTab(ArrayList <Integer> tab) {
		this.tab = tab;
	}
	
	
	
	
	/*Random random = new Random();
	private char[] nbr;
	private static String nbrList = "0123456789";
	
	int r = random.nextInt(10);
	
	public void randomNombre() {
		int randoms;
		char[] value = new char[4];
		for(int i = 0; i < 4; i++) {
			randoms = random.nextInt(10);
			value[i] = (char)nbrList.charAt(randoms);
		}
		this.nbr = value;
		System.out.print(nbr);
	}
	
	

	
	
	public void nombre() {
		System.out.println("Saisi nombre");
		Scanner sc = new Scanner (System.in);
		String nombre = sc.nextLine();
		String digits[] = nombre.split("(?<=.)");
		String nombreIA = String.valueOf(r);
		String[] digit = nombreIA.split("(?<=.)");
		
		List<String> unombre = new ArrayList<String>();
		unombre = Arrays.asList(digits);
		for(String s: unombre) {
			System.out.println(s);
		}
		
		List<String> inombre = new ArrayList<String>();
		inombre = Arrays.asList(digit);
		for(String S : inombre) {
			System.out.println(S);
		}
	
		ArrayList<String> L3 = new ArrayList<String>();
		for(String o:unombre) {
			if(inombre.contains(o)) {
				L3.add("1");
			}else {
				L3.add("0");
			}
			
			
		}
		
		
		
		System.out.println("Vous avez saisi: " + nombre + " " + r);
		
	}
	
	public void guestnombre() {
		
		System.out.println("Devinez le chiffre: ");
		Scanner sc = new Scanner (System.in);
		int nombre = sc.nextInt();
		int i = 0;
		
		
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
					break;
				
				}
				
				if ( i == 10){
					System.out.println("Vous avez perdu");
				}
							
			}
			
			
		}
	
	public void GuestNombre() {
		
		
		Scanner sc = new Scanner (System.in);
		String nombre = sc.nextLine();
		
		int t = nombre.length();
		
		int randoms;
		char[] value = new char[4];
		for(int i = 0; i < 4; i++) {
			randoms = random.nextInt(10);
			value[i] = (char)nbrList.charAt(randoms);
		}
		this.nbr = value;
		System.out.print(nbr);
		
		for(int i = 0; i < t; i++) {
			char usrnbr = nombre.charAt(0);
			char usrnbr1 = nombre.charAt(1);
			char usrnbr2 = nombre.charAt(2);
			char usrnbr3 = nombre.charAt(3);
			
			System.out.print("Vous avez saisi : " + usrnbr + usrnbr1 + usrnbr2 + usrnbr3 +"\n");
			
			if(nbr[i] < usrnbr  ) {
				System.out.println("-" );
				nombre= sc.nextLine();
				
				
			}else if(nbr[i] > usrnbr) {
				System.out.println("+");
				nombre = sc.nextLine();
			}else if (nbr[i] == usrnbr ) {
				System.out.println("Vous avez gagné le nombre mystère était :" + nbr[i]);
			}
			
		}*/


		
	}

