package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				
				  int radio;
				  double perimetro, area;
				  double pi = 3.1416;
			    
				
				System.out.print("Radio: ");
				radio=sc.nextInt();
				
				perimetro = 2*pi*radio;
				area = pi*radio*radio;
				
				System.out.println("Resultados");
				System.out.println("----------");
				System.out.println("Area del circulo: " + area);
				System.out.println("perimetro: "+perimetro);
				
				
				
				
					

	}

}
