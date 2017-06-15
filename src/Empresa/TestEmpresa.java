package Empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmpresa {

	@Test
	public void testpValido1() {
	assertEquals(300, Empresa.calcularCodigo("100;Diego Alvarez;01;SI"));
	}

	@Test
	public void testpValido2() {
	assertEquals(500, Empresa.calcularCodigo("101;Alba Gomez;07;NO"));
	}

	@Test(expected = Exception.class)
	public void test1() {
	Empresa.calcularCodigo("000;Jesus Garcia;10;SI");
	}

	@Test(expected = Exception.class)
	public void test2() {
	Empresa.calcularCodigo("1001;Carmen Ruiz;9;NO");
	}

	@Test(expected = Exception.class)
	public void test3() {
	Empresa.calcularCodigo("abc;Sandra Lopez;2;SI");
	}

	@Test(expected = Exception.class)
	public void test4() {
	Empresa.calcularCodigo("123;Vanesa Perez;2;SI");
	}

	@Test(expected = Exception.class)
	public void test5() {
	Empresa.calcularCodigo("123;Juan Gonzalez Fernandez;3;SI");
	}

	@Test(expected = Exception.class)
	public void test6() {
	Empresa.calcularCodigo("123;Carmen Ruiz;-1;SI");
	}

	@Test(expected = Exception.class)
	public void test7() {
	Empresa.calcularCodigo("123;Carmen Ruiz;ab;NO");
	}

	@Test(expected = Exception.class)
	public void test8() {
	Empresa.calcularCodigo("123;Carmen Ruiz;8;*");
	}
}
