import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		final int TAM=4;
		float vetor[] = new float[TAM];
		float soma = 0;
		float media = 0;

		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite as notas: ");
			vetor[i] = entrada.nextFloat();
		}
		

		for (int i = 0; i < vetor.length; i++) {
			soma = soma+vetor[i];
			System.out.print("Nota: "+ vetor[i]+ "|");
		}

		media= soma/TAM;
		System.out.println();
		System.out.println("Média :" + media);
		
		entrada.close();
	}
	}


