package com.everis.alicante.beca.calculadora2;

import java.util.Scanner;

public class CalculadoraUI {

	public static void main(String[] args){
		
		calculadoraManager pruebaChunga = new calculadoraManager;
		
		calculadoraManager.pruebaChunga();
		
		public void pruebaChunga() {

			Scanner sc = new Scanner(System.in);
			Calculadora calc = new Calculadora();

			System.out.println("Escoge la operacion que desas realizar:");
			System.out.println("1.Suma ");
			System.out.println("2.Resta ");
			System.out.println("3.Multiplicacion ");
			System.out.println("4.Division");

			int opcion = sc.nextInt();
			double resultado = 0;

			switch (opcion) {
			case 1:
				System.out.println("Introduce los dos numeros que quieres sumar:");

				int numero1 = sc.nextInt();
				int numero2 = sc.nextInt();

				resultado = calc.suma(numero1, numero2);

				break;

			case 2:
				System.out.println("Introduce los dos numeros que quieres restar: ");

				numero1 = sc.nextInt();
				numero2 = sc.nextInt();

				resultado = calc.resta(numero1, numero2);

				break;

			case 3:

				System.out.println("Introduce los dos numeros que quieres multiplicar: ");

				numero1 = sc.nextInt();
				numero2 = sc.nextInt();

				resultado = calc.multiplicacion(numero1, numero2);

				break;

			case 4:
				System.out.println("Introduce los dos digitos que quieres dividir");

				numero1 = sc.nextInt();
				numero2 = sc.nextInt();

				resultado = calc.division(numero1, numero2);

			default:

			}

			System.out.println("El resultado de la operacion es :" + resultado);
		}
		
		
		
		
		
		
	

}
