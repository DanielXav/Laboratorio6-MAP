import Entities.Circulo;
import Entities.Retangulo;
import Entities.Triangulo;

public class Application {
	public static void main(String args[]) {
		
		Circulo circulo = Circulo.getInstancia();
		Circulo circulo2 = Circulo.getInstancia();
	
		System.out.printf("%n------------------------------------------------%n%n");
		
		Triangulo isosceles = Triangulo.getInstancia();
		isosceles.setLado1(10);
		isosceles.setLado2(10);
		isosceles.setLado3(5);
		Triangulo equilatero = Triangulo.getInstancia();
		equilatero.setLado1(10);
		equilatero.setLado2(10);
		equilatero.setLado3(10);
		Triangulo retangulo = Triangulo.getInstancia();
		retangulo.setLado1(13);
		retangulo.setLado2(12);
		retangulo.setLado3(5);
		Triangulo triangulo = Triangulo.getInstancia();
		
		System.out.printf("%n------------------------------------------------%n%n");
		
		Retangulo retangulo1 = Retangulo.getInstancia();
		Retangulo retangulo2 = Retangulo.getInstancia();
		Retangulo retangulo3 = Retangulo.getInstancia();
		
	}
	
}
