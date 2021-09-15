package com.senati.eti;

import java.util.Scanner;

public class Caso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Numero de aprobados: ");
		float aprobados = sc.nextFloat();
		
		System.out.print("Numero de desaprobados: ");
		float desaprobados = sc.nextFloat();
		
		System.out.print("Numero de retirados: ");
		float retirados = sc.nextFloat();
		
		float suma= aprobados + desaprobados + retirados;
		
	   float num1=aprobados*100/suma;
	   float num2=desaprobados*100/suma;
	   float num3=retirados*100/suma;
		
				
		System.out.println("RESULTADOS");
		System.out.println("----------");
		System.out.println("Aprobados..: " + num1 + "%");
		System.out.println("Desaprobados..: " + num2 + "%");
		System.out.println("Retirados..: " + num3 + "%");
		
		
		
		
		
		
		
		

	}

}
