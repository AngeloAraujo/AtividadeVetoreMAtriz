import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float notas [] = new float[4];
		float soma = 0;
		float media;
	
		for(int i = 0; i < 4; i++ ) {
			System.out.println("Digite a nota: ");
			notas[i] = entrada.nextFloat();
			soma = soma + notas[i];
		}
		media = soma/4;
	
		System.out.println("A média das notas é: " + media);
		
		entrada.close();
	}

}
