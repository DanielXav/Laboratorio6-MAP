import Entities.Circulo;
import Entities.Retangulo;
import Entities.Triangulo;

public class Application {
	public static void main(String args[]) {
		
		Circulo circulo = Circulo.getInstancia();
		Circulo circulo2 = Circulo.getInstancia();
	
		System.out.printf("%n------------------------------------------------%n%n");
		
		Triangulo isosceles = Triangulo.getInstancia();
		Triangulo equilatero = Triangulo.getInstancia();
		Triangulo retangulo = Triangulo.getInstancia();
		Triangulo triangulo = Triangulo.getInstancia();
		
		System.out.printf("%n------------------------------------------------%n%n");
		
		Retangulo retangulo1 = Retangulo.getInstancia();
		Retangulo retangulo2 = Retangulo.getInstancia();
		Retangulo retangulo3 = Retangulo.getInstancia();
		
	}
	
}
