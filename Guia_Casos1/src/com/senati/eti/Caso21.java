package com.senati.eti;

import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int precio;
		int cantidad;
		
		System.out.print("Ingrese el precio: ");
	      precio = sc.nextInt();

	      System.out.print("Ingrese la cantidad: ");
	       cantidad = sc.nextInt();
	       
	       float total = precio * cantidad - 0.12f;
	       
	       System.out.println("Resultados");
	        System.out.println("----------");
	        System.out.println("Valor del producto..: " + total);
	      
	      
		

	}

}
