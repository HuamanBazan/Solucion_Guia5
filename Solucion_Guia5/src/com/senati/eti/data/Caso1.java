package com.senati.eti.data;
import com.senati.eti.model.Calculadora1;
import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculadora1 objCalc = new Calculadora1();
		
		float n1 = 0, n2 = 0;
		System.out.println("       LECTURA DE NUMEROS");
		System.out.println("-------------------------------");
		System.out.println("Número 1 ");
		n1 = sc.nextFloat();
		System.out.println("Número 2 ");
		n2 = sc.nextFloat();
		objCalc.setNumero1(n1);
		objCalc.setNumero2(n2);
		
		System.out.println("         RESULTADOS");
		System.out.println("-------------------------------");
		System.out.println("Suma.................:"  + objCalc.Suma());
		System.out.println("Resta................:"  + objCalc.Resta());
		System.out.println("Producto.............:"  + objCalc.Producto());
		
		if (n2 == 0) {
			System.out.println("Division.............:No es posible");
		}else {
			System.out.println("Division.............:"  + objCalc.Division());
		}
		if (n2 == 0) {
			System.out.println("Resto entero.........:No es posible");
		}else {
			System.out.println("Resto entero.........:"  + objCalc.Resto());
		}
	}

}
