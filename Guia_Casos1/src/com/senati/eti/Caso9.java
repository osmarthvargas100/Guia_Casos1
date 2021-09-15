package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int lado1 = 6;
		int lado2 = 8;
        float perimetro = lado1*2 + lado2*2;
       
		
		System.out.print("Ingrese el lado 1: ");
		lado1= sc.nextInt();
		System.out.print("Ingrese el lado 2: ");
		lado2= sc.nextInt();
		
		System.out.println("Resultados");
        System.out.println("----------");
        System.out.println("Area del rectangulo: " + lado1 * lado2);
        System.out.println("perimetro "+perimetro);
        
	   
		

	}

}
