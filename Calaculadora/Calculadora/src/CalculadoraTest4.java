import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculadoraTest4 {

	@ParameterizedTest
	@ValueSource(strings = { "Hola", "Mundo" })
	void mensajeNoNulo(String cadena) {
		assertNotNull(cadena);
	}

	@ParameterizedTest
	@CsvSource({ "20,   10,   2" })
	public void testDivide0(int a, int b, int valorEsperado) {
		Calculadora calcu = new Calculadora(a, b);
		int resultado = calcu.divide();
		assertEquals(valorEsperado, resultado);
	}

	@ParameterizedTest
	@CsvSource({ "20,   10,   2", "30,   -2,  -15", " 5,    2,    3 " })
	public void testDivide1(int a, int b, int valorEsperado) {
		Calculadora calcu = new Calculadora(a, b);
		int resultado = calcu.divide();
		assertEquals(valorEsperado, resultado);
	}

}
