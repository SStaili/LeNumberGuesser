package com.nombremystere;


import java.util.ArrayList;
import java.util.Scanner;

public class TabGen {

	public  void Generer () {
		// TODO Auto-generated method stub
		
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
	        
	        	

	}

	
	
	public void remplirTableau() {
		Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int valeur = 1;
        int[] nombre = new int[4];
        
        for(int j = 0; j < 4; j++) {
        	nombre[j] = valeur ++;
        }
        
        for(int j = 0; j < 4; j++) {
			System.out.print(nombre[j]);
		}
        
   
        
	}
	
	
	

import java.util.*;
 														
public class TabGen
{
    public static  void main(String args[])
    {
        ArrayList <Integer> tab = new ArrayList <Integer> (4);
        int length = 0;
 
        while (length < 4)
        {
            int n = (int) (Math.random() * 10);
            
            tab.add(n);
            length += 1;
        }
 
        for (int i=0; i<4; i++)
        	System.out.print(tab.get(i));
    }

}
