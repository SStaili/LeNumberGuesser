package com.nombremystere;

import java.util.Random;
import java.util.Scanner;

public class Nombre {
	private int nombre;
	Random userRandom = new Random();
	int randomNombre = userRandom.nextInt(1000);
	
	public Nombre(int nombre) {
		this.nombre = nombre;
		Scanner sc = new Scanner (System.in);
		nombre = sc.nextInt();
		System.out.println("Vous avez saisi" + nombre);
		
	}
}
