import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int vetor[] = new int[10];
		int vetor2[] = new int[10];
		int vetor3[] = new int[20];
		int k=0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite os valores do primeiro vetor : ");
				vetor[i] = Integer.parseInt(entrada.nextLine());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite os valores do segundo vetor : ");
				vetor2[i] = Integer.parseInt(entrada.nextLine());
		}
		
		for (int i = 0; i < 10; i++) {
			vetor3[k] = vetor[i];
				k++;
			vetor3[k] = vetor2[i];
				k++;
		}
		
		System.out.println("O terceiro vetor � composto pelos elementos: ");
		
			for (int i = 0; i < 20; i++) {
				System.out.println(vetor3[i]);
		}
		entrada.close();
	}

}
