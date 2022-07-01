package Entities;

import Exceptions.FiguraComAtributoIgualAZeroException;
import Exceptions.FiguraComAtributoNegativoException;

public class Circulo {

	private static Circulo instanciaUnica = null;
	private double raio;

	private Circulo() {
	}

	public static Circulo getInstancia() {
		if (instanciaUnica == null) {
			System.out.println("Criando uma inst�ncia �nica do Circulo.");
			instanciaUnica = new Circulo();
		}
		System.out.println("Retornando instancia do Circulo.");
		return instanciaUnica;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if (raio < 0) {
			throw new FiguraComAtributoNegativoException("Raio negativo n�o existe.");
		} else if (raio == 0) {
			throw new FiguraComAtributoIgualAZeroException("Raio igual a zero n�o existe.");
		}
		this.raio = raio;
	}

}
