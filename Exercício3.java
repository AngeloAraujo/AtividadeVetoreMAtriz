import java.util.Scanner;
public class Exerc�cio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o tamanho do vetor: ");
		int tam = entrada.nextInt();
		int vetor[] = new int[tam];
		int k;

		for (k = 0; k < tam; k++) {
			System.out.print("Digite os valores do vetor: ");
			vetor[k] = entrada.nextInt();
		}
		float soma = 0;
		int menor = 0;
		int maior = 0;
		float media = 0;

		for (k = 0; k < tam; k++) {

			if (k == 0) {
				menor = vetor[k];
				maior = vetor[k];
			}
			else {

				if (vetor[k] < menor) {
					menor = vetor[k];
				}
				else if (vetor[k] > maior) {
					maior = vetor[k];
				}
			}
		soma = soma + vetor[k];
		
		}
		media = soma / tam;

		int par = 0;
		int impar = 0;

		int mediacima = 0;
		int mediabaixo = 0;

		for (k = 0; k < tam; k++) {
			if (vetor[k] % 2 == 0) {
				par++;
			} else if (vetor[k] % 2 != 0) {
				impar++;
			}
		}

		for (k = 0; k < tam; k++) {
			if (vetor[k] > media) {
				mediacima = mediacima + 1;
			} else {
				mediabaixo = mediabaixo + 1;
			}

		}
		System.out.println("A soma ser� : " + soma);
		System.out.println("A m�dia ser� : " + media);
		System.out.println("O maior valor do vetor ser�: " + maior);
		System.out.println("O menor valor valor do vetor ser�: " + menor);
		System.out.println("N�mero pares: " + par);
		System.out.println("N�meros �mpares: " + impar);
		System.out.println("N�meros acima da m�dia : " + mediacima);
		System.out.println("N�meros abaixo da m�dia : " + mediabaixo);

		entrada.close();
	}



	}


