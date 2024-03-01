package Ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LibroAliciaTest {

	@Test
	void testGetTitulo() {
		LibroAlicia libro1 = new LibroAlicia("Los pilares de la tierra",856);
		String titulo = libro1.getTitulo();
		assertEquals("Los pilares de la tierra",titulo);
		
	}

	@Test
	void testSetTitulo() {
		LibroAlicia libro1 = new LibroAlicia (" ",856);
		libro1.setTitulo("Los pilares de la tierra");
		assertEquals("Los pilares de la tierra",libro1.getTitulo());
	}

	@Test
	void AgregarPaginas() {
		LibroAlicia libro1 = new LibroAlicia("Los pilares de la tierra",856);
		libro1.agregarPaginas(100);
		assertEquals(956,libro1.getNumeroDePaginas());
	}

	@Test
	void testQuitarPaginas() {
		LibroAlicia libro1 = new LibroAlicia("Los pilares de la tierra",856);
		libro1.quitarPaginas(200);
		assertEquals(656,libro1.getNumeroDePaginas());
	}

}


/* El motivo de que el porcentaje de la clase Libro no es el 100% si todos los métodos tienen 
 * pruebas válidas es porque no hemos probado todos los métodos incluidos en la clase.
 * De los 7 métodos incluidos en esta clase, tan solo hemos probado 4 de ellos. 
 * Por esa razón, aunque todos los métodos han pasado las pruebas, el análisis de la 
 * cobertura no es del 100% sino entorno al 68%*/
