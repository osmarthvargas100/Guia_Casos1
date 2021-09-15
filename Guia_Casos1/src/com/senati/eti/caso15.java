package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat; 

public class caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.01");
		
		System.out.print("Ingrese Cantidad: ");
		float cantidad 	= sc.nextFloat();
		
		System.out.print("Ingrese Precio: ");
		float precio = sc.nextFloat();
		
		
		float importe = cantidad * precio;
		float Dolares = importe / 3.24f;
		float Euros = importe / 3.75f;
		
		
		System.out.println("---------------");
		System.out.println("RESULTADOS");
		System.out.println("---------------");
		System.out.println("importe: " + df.format(importe));
		System.out.println("Dolares: " + df.format(Dolares));
		System.out.println("Euros: " + df.format(Euros));
		
		
		
		
		
		

	}

}
