package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;
import main.CalculatorIpml;

class CalculatorImplTest {
	
	private Calculator calc = new CalculatorIpml();
	
	@Test
	void testAdd() {
		int a, b, res;
		
		a = 5; b = 5;
		res = a + b;
		if(calc.add(a, b) != res) {
			fail("a et b positif");
		}
		
		a = 0; b = 5;
		res = a + b;
		if(calc.add(a, b) != res) {
			fail("a null");
		}
		
		a = 2; b = 0;
		res = a + b;
		if(calc.add(a, b) != res) {
			fail("b null");
		}
		
		a = -2; b = 3;
		res = a + b;
		if(calc.add(a, b) != res) {
			fail("a negatif");
		}
		
		a = 2; b = -3;
		res = a + b;
		if(calc.add(a, b) != res) {
			fail("b negatif");
		}
	}

	@Test
	void testMultiply() {
		int a, b, res;
		
		a = 5; b = 5;
		res = a * b;
		if(calc.multiply(a, b) != res) {
			fail("a et b positif");
		}
		
		a = 0; b = 5;
		res = a * b;
		if(calc.multiply(a, b) != res) {
			fail("a null");
		}
		
		a = 2; b = 0;
		res = a * b;
		if(calc.multiply(a, b) != res) {
			fail("b null");
		}
		
		a = -2; b = 3;
		res = a * b;
		if(calc.multiply(a, b) != res) {
			fail("a negatif");
		}
		
		a = 2; b = -3;
		res = a * b;
		if(calc.multiply(a, b) != res) {
			fail("b negatif");
		}
	}

	@Test
	void testDivide() {
		int a, b, res;
		
		a = 5; b = 5;
		res = a / b;
		if(calc.divide(a, b) != res) {
			fail("a et b positif");
		}
		
		a = 0; b = 5;
		res = a / b;
		if(calc.divide(a, b) != res) {
			fail("a null");
		}
		
		a = 2; b = 0;
		try {
	        res = a / b; 
	        if(calc.divide(a, b) != res) {
				fail("b null");
			}
	    } catch (ArithmeticException e) {
	        System.out.println("Exception capturée pour b = 0, test réussi !");
	    }
		
		a = -2; b = 3;
		res = a / b;
		if(calc.divide(a, b) != res) {
			fail("a negatif");
		}
		
		a = 2; b = -3;
		res = a / b;
		if(calc.divide(a, b) != res) {
			fail("b negatif");
		}
	}

	@Test
	void testSubstract() {
		int a, b, res;
		
		a = 5; b = 5;
		res = a - b;
		if(calc.substract(a, b) != res) {
			fail("a et b positif");
		}
		
		a = 0; b = 5;
		res = a - b;
		if(calc.substract(a, b) != res) {
			fail("a null");
		}
		
		a = 2; b = 0;
		res = a - b;
		if(calc.substract(a, b) != res) {
			fail("b null");
		}
		
		a = -2; b = 3;
		res = a - b;
		if(calc.substract(a, b) != res) {
			fail("a negatif");
		}
		
		a = 2; b = -3;
		res = a - b;
		if(calc.substract(a, b) != res) {
			fail("b negatif");
		}
	}

}
