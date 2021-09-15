package com.senati.eti;

import java.util.Scanner;

public class Clase18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int altura;
		int base;
		
		System.out.print("Ingrese la altura del triangulo: ");
		altura= sc.nextInt();
		System.out.print("Ingrese la base del triangulo: ");
		base= sc.nextInt();
		
		float area = altura * base /2;

		System.out.println("Resultados");
        System.out.println("----------");
        System.out.println("Area del triangulo: " + area);
	}

}
