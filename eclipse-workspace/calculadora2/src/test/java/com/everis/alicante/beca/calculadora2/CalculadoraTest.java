package com.everis.alicante.beca.calculadora2;


import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calculadora = new Calculadora();

	@Test
	public void testSuma() { 

		// Act
		int result = calculadora.suma(2, 4);

		// Assert

		Assert.assertEquals(6, result);

	}

	@Test
	public void testResta() {

		// Act
		int result = calculadora.resta(2, 2);

		// Assert

		Assert.assertEquals(0, result);

	}

	@Test
	public void testMultiplicacion() {

		// Act
		int result = calculadora.multiplicacion(9, 9);

		// Assert

		Assert.assertEquals(81, result);

	}

	@Test
	public void testDivision() {
		// Act
		double result = calculadora.division(400, 2);

		// Assert
		Assert.assertEquals(200, result, 0);
	}
}
