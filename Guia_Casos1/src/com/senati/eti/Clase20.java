package com.senati.eti;

import java.util.Scanner;

public class Clase20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cantidad;
		int precio;
		
		System.out.print("Ingrese la cantidad: ");
	      cantidad = sc.nextInt();
	      
	      System.out.print("Ingrese el precio: ");
	      precio = sc.nextInt();
	      
	      float total = precio * cantidad * 0.45f;
	      
	      System.out.println("Resultados");
	        System.out.println("----------");
	        System.out.println("Valor del producto..: " + total);
		

	}

}
