package Fatec.calc.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Fatec.calc.servico.Calculadora;

public class UC01SomaDePArcelas {
	static Calculadora calculadora;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculadora = new Calculadora();
	}
	
	@Test
	public void CT01UC01SomaDePArcelas_com_sucesso() {
		assertEquals("resultado =", 5,calculadora.soma("2, 3"),0);
	}
	
	@Test(expected = RuntimeException.class)
	public void CT02UC01SomaDePArcelas_dados_invalidos() {
		assertEquals("resultado =", 5,calculadora.soma("x, 2"),0);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

}
