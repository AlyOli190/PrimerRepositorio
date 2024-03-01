package programas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cuentaTest {
	
	
	@Test
	void testSetSaldo() {
		cuenta cuenta1 = new cuenta ("ES1234567890123456789123",0);
		cuenta1.setSaldo(100);
		assertEquals(90,cuenta1.getSaldo());
	}
	
	@Test
	void testGetSaldo() {
		cuenta cuenta1 = new cuenta ("ES1234567890123456789123",100);
		float saldo = cuenta1.getSaldo();
		assertEquals(100,saldo);
	}

	@Test
	void testIngresarDinero() {
		cuenta cuenta1 = new cuenta ("ES1234567890123456789123",100);
		cuenta1.ingresarDinero(400);
		assertEquals(500,cuenta1.getSaldo());
	}

	@Test
	void testExtraerDinero() {
		cuenta cuenta1 = new cuenta ("ES1234567890123456789123",100);
		cuenta1.extraerDinero(20);
		assertEquals(80,cuenta1.getSaldo());
	}

}
