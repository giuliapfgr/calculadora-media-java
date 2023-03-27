package TesteJava;

import java.util.Scanner;

public class MostraMedia {
	
	private CalculadoraJava calc;
	public MostraMedia() {
		this.calc = new CalculadoraJava();
	}
	public static void main(String[] args) {
		MostraMedia mm = new MostraMedia();
		mm.Mostrar();
	}
	public void Mostrar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		float n1 = sc.nextFloat();
		System.out.println("Digite a segunda nota: ");
		float n2 = sc.nextFloat();
		System.out.println("Digite a terceira nota: ");
		float n3 = sc.nextFloat();
		
		float media = calc.Media(n1, n2, n3);
		System.out.println("A media é " + media);
	}
	
}