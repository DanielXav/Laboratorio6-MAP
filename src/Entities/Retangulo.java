package Entities;

public class Retangulo {

	private static Retangulo instanciaUnica = null;

	private Retangulo() {
	}

	public static Retangulo getInstancia() {

		System.out.println("Criando uma inst�ncia �nica do Retangulo.");
		instanciaUnica = new Retangulo();

		System.out.println("Retornando instancia do Retangulo.");
		return instanciaUnica;
	}
}
