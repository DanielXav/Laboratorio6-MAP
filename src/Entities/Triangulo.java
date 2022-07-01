package Entities;

import Exceptions.FiguraComAtributoIgualAZeroException;
import Exceptions.FiguraComAtributoNegativoException;

public class Triangulo {

	private static Triangulo instanciaUnica = null;
	private double lado1;
	private double lado2;
	private double lado3;
	private static int count = 0;
	
	private Triangulo() {
	}
	
	public static Triangulo getInstancia() {
		if (instanciaUnica == null || count < 3) {
			System.out.println("Criando uma instância do Triangulo.");
			instanciaUnica = new Triangulo();
			count++;
		}
		System.out.println("Retornando instancia do Triangulo.");
		return instanciaUnica;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1 < 0) {
			throw new FiguraComAtributoNegativoException("Lado negativo não existe.");
		}
		else if (lado1 == 0) {
			throw new FiguraComAtributoIgualAZeroException("Lado igual a 0 não existe.");
		}
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 < 0) {
			throw new FiguraComAtributoNegativoException("Lado negativo não existe.");
		}
		else if (lado2 == 0) {
			throw new FiguraComAtributoIgualAZeroException("Lado igual a 0 não existe.");
		}
		this.lado2 = lado2;
	}

	public double getLado3() {
		if (lado3 < 0) {
			throw new FiguraComAtributoNegativoException("Lado negativo não existe.");
		}
		else if (lado3 == 0) {
			throw new FiguraComAtributoIgualAZeroException("Lado igual a 0 não existe.");
		}
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
}
