import java.util.Scanner;

public class Exercício14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i = 0;
		int k = 0;
		int vetor[] = new int[10];
		int vetor2[] = new int[10];
		int vetor3[] = new int[20];

		for (i = 0; i < 10; i++) {
			System.out.println("Digite os valores do primeiro vetor : ");
				vetor[i] = Integer.parseInt(entrada.nextLine());
		}
		
		for (i = 0; i < 10; i++) {
			System.out.println("Digite os valores do segundo vetor : ");
				vetor2[i] = Integer.parseInt(entrada.nextLine());
		}
		
		for (i = 0; i < 10; i++) {
			vetor3[k] = vetor[i];
				k++;
			vetor3[k] = vetor2[i];
				k++;
		}
		
		System.out.println("O terceiro vetor é composto pelos elementos: ");
		
			for (i = 0; i < 20; i++) {
				System.out.println(vetor3[i]);
		}
		entrada.close();
	}

}
