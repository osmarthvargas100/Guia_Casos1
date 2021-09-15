package com.senati.eti;

import java.util.Scanner;
public class caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese  lado del cuadrado");
		int lado = sc.nextInt();
		
		//int area = lado*lado;
		int area = (int) Math.pow(lado, 2);
		int perimetro = lado *  4;
		
		System.out.println("RESULTADOS");
		System.out.println("-----------");
		System.out.println("Area........: " + area);
		System.out.println("perimetro.....: " + perimetro);		

	}

}
