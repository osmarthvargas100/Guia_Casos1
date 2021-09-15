package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese horas trabajadas: ");
		float horas = sc.nextFloat();
		
		System.out.print("Ingrese tarifa por hora: ");
		float tarifa = sc.nextFloat();
		
		float Sueldo = horas * tarifa;
		float Bono = horas + 5.0f;
		float Total = Sueldo + Bono;
		float Dolares = Total / 3.24f;
		
		
		
		
		System.out.println("RESULTADOS");
		System.out.println("---------------");
		System.out.println("Sueldo.........: " + horas * tarifa);
		System.out.println("Bono...........: " + Bono );
		System.out.println("Total..........: " + Total);
		System.out.println("Total Dolares..: " + df.format(Dolares));
		
		
		
		

	}

}
