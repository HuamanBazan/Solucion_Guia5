package com.senati.eti.data;
import java.util.Scanner;
import com.senati.eti.model.Calculadora2;

public class Caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float n1 = 0, n2=0;
		
		System.out.println("LECTURA DE NÚMEROS");
		System.out.println("----------------");
		System.out.println("NUMERO 1");
		n1 = sc.nextFloat();
		System.out.println("NUMERO 2");
		n2 = sc.nextFloat();
		
		Calculadora2 objCalc = new Calculadora2(n1,n2);
		
		System.out.println("         RESULTADOS");
		System.out.println("-------------------------------");
		System.out.println("Suma.................:"  + objCalc.Calcular(1));
		System.out.println("Resta................:"  + objCalc.Calcular(2));
		System.out.println("Producto.................:"  + objCalc.Calcular(3));
		System.out.println("Division................:"  + objCalc.Calcular(4));
		System.out.println("Resto Entero.................:"  + objCalc.Calcular(5));
		System.out.println("Promedio................:"  + objCalc.Calcular(6));
		System.out.println("Suma de Cuadrados.................:"  + objCalc.Calcular(7));
		System.out.println("Diferencia Porcentual................:"  +   objCalc.Calcular(8) + "%");
		System.out.println("Numero mayor .................:"  + objCalc.Calcular(9));
		System.out.println("Numero menor................:"  + objCalc.Calcular(10));
		


	}

}
