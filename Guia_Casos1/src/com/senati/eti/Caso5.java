package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer numero: ");
		float numero1 = sc.nextFloat();
		
		System.out.print("Segundo numero: ");
		float numero2 = sc.nextFloat();  
		
		float resultado1 = (numero1 + numero2) / 2;
		float resultado2 = numero1 + numero1* 2f;
		float resultado3 = (float)(numero2 - numero2 * 0.3);
		
		System.out.println("\nRESULTADOS");
	    System.out.println("----------");
	    System.out.println("Resultado 1.......: " + resultado1);
	    System.out.println("Resultado 2.......: " + resultado2);
	    System.out.println("Resultado 3.......: " + resultado3);
		
		

	}

}
