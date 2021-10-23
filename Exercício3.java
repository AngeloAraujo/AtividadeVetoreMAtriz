import java.util.Scanner;
public class Exercício3 {

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
		System.out.println("A soma será : " + soma);
		System.out.println("A média será : " + media);
		System.out.println("O maior valor do vetor será: " + maior);
		System.out.println("O menor valor valor do vetor será: " + menor);
		System.out.println("Número pares: " + par);
		System.out.println("Números ímpares: " + impar);
		System.out.println("Números acima da média : " + mediacima);
		System.out.println("Números abaixo da média : " + mediabaixo);

		entrada.close();
	}



	}


