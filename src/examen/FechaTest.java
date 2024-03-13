package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	FechaTest miFechaTest = new FechaTest();

	@Test
	void test1() {
		boolean assertFalse = miFechaTest.validarFecha(0, 0, -5);
	}
	@Test
	void test2() {
		boolean assertFalse = miFechaTest.validarFecha(0, -2, 15);
	}
	@Test
	void test3() {
		boolean assertFalse = miFechaTest.validarFecha(-8, 4, 23);
	}
	@Test
	void test4() {
		boolean assertFalse = miFechaTest.validarFecha(2008, 15, 14);
	}

	private boolean validarFecha(int i, int j, int k) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
