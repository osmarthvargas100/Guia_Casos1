package com.senati.eti;

import java.util.Scanner;

public class Clase19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.print("Ingrese el primer lado del triangulo: ");
	      a = sc.nextInt();
	      
	      System.out.print("Ingrese el segundo lado del triangulo: ");
	      b = sc.nextInt();
	      
	      System.out.print("Ingrese el tercero lado del triangulo: ");
	      c = sc.nextInt();
	      
	      float lado = a + b + c;
		
	      
		System.out.println("Resultados");
        System.out.println("----------");
        System.out.println("Perimetro..: " + lado);

	}

}
