import java.util.Scanner;

public class Exercício6 {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int c;
		int quantidadepar = 0;
		int quantidadeimpar = 0;
		final int TAM= 20;
		int pospar=0,posimpar=0;
		
		int [] num=new int [TAM];
		
		for( c = 0; c < TAM; c++) {
			System.out.println("Digite um número: ");
		    num[c] = entrada.nextInt();
		}   
		
		System.out.println("Vetor: ");
		for(c = 0; c < TAM; c++) {
		  if (num[c] % 2 == 0) {
			  quantidadepar ++;
		  }
		  else if(num[c] % 2 != 0) {
			  quantidadeimpar++;
		  }
		  System.out.println(num[c]+" ");
		}
		int[] pares = new int [quantidadepar];
		int[] impares = new int [quantidadeimpar];
		
		for(c = 0; c < TAM; c++) {
			if (num[c] % 2 == 0) {
				pares[pospar] = num[c];
				pospar++;
			}
			else if(num[c] % 2 != 0) {
			 impares[posimpar] = num[c];
			 posimpar++;
			}
		}
		System.out.println("Números pares: ");
		for (int i: pares) {
			System.out.println(i);
		}
		System.out.println("Números ímpares: ");
		for (int i: impares) {
			System.out.println(i);
		}
entrada.close();	
	}

}
