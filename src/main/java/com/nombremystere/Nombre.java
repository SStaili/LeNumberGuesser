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
	        	//System.out.print(tab.get(i));
	        }   
	        
	        this.tab = tab;
	        	

	}
	
	public  void remplirTableau() {
		Scanner sc = new Scanner(System.in);
		 ArrayList <Integer> nombre = new ArrayList <Integer> (4);
		 String n = sc.nextLine();
        
        for(int j = 0; j < 4; j++) {
        	//Comme on transforme des charactère en int ça fait appel à une table ASCII on fait -48 pour avoir le bon nombre
        	nombre.add((int)n.charAt(j) -48);
        	
        	
        }
        
        
         this.nombre = nombre;
         
        
	}
	
	public void Comparer(String resultat) {
		
		System.out.println("Saisi nombre");
		System.out.println(this.tab);
		this.remplirTableau();
		System.out.println(this.nombre);
		
		 resultat = new String();
		
		for(int i = 0; i < 4; i++) {
			if(this.tab.get(i) > this.nombre.get(i)) {
				
				resultat += '+';
				
			}
			else if(this.tab.get(i)< this.nombre.get(i)) {
				resultat += '-';
				
			}
			else if(this.tab.get(i) == this.nombre.get(i)) {
				resultat += '=';
				
			}
			
		}
		System.out.println(resultat + '\n');	
				
		
	}
	
public void ComparerIA(String resultat) {
		
		System.out.println("Saisi nombre");
		System.out.println(this.tab);
		this.Generer();
		System.out.println(this.nombre);
		
		 resultat = new String();
		
		for(int i = 0; i < 4; i++) {
			if(this.tab.get(i) > this.nombre.get(i)) {
				
				resultat += '+';
				
			}
			else if(this.tab.get(i)< this.nombre.get(i)) {
				resultat += '-';
				
			}
			else if(this.tab.get(i) == this.nombre.get(i)) {
				resultat += '=';
				
			}
			
		}
		System.out.println(resultat + '\n');	
				
		
	}
	
	
	public void GuessNombre() {
		int k = 0;
		String resultat = new String();
		ArrayList<Integer> IA = this.tab;
		ArrayList<Integer> user = this.nombre;
		
	
		while(k < 10) {
			System.out.println("Presenter nombre");
			
			if(resultat.equals("====")) {
				System.out.println("Vous avez gagne");
			} 
			this.Comparer(resultat);
			
			k++;
		}
		if(k == 10){
			System.out.println("Vous avez perdu");
		}else {
			System.out.println("Vous avez gagner");
		}
		
		
		
	}
	
	public void IAGuess() {
		int k = 0;
		String resultat = new String();
		ArrayList<Integer> IA = this.tab;
		ArrayList<Integer> user = this.nombre;
		
		while(k < 10) {
			System.out.println("Presenter nombre");
			
			if(resultat.equals("====")) {
				System.out.println("Vous avez gagne");
			} 
			this.ComparerIA(resultat);
			
			k++;
		}
		if(k == 10){
			System.out.println("Vous avez perdu");
		}else {
			System.out.println("Vous avez gagner");
		}
	}

	public ArrayList <Integer> getTab() {
		return tab;
	}

	public void setTab(ArrayList <Integer> tab) {
		this.tab = tab;
	}
	
	
	
	
	


		
	}

