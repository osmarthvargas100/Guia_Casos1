package com.senati.eti;

import java.util.Scanner;

public class Clase22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese su nota 1: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Ingrese su nota 2: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Ingrese su nota 3: ");
		float nota3 = sc.nextFloat();
		
		float promedio1 = nota1 + 0.20f;
	    float promedio2 = nota2 + 0.30f;
	    float promedio3 = nota3 + 0.50f;
	    
	    System.out.println("Resultados");
        System.out.println("----------");
        System.out.println("Promedio..: " + promedio1 * promedio2 + promedio3);
	    
	    
	    
	    
				
		
		
		
		
		

	}

}
