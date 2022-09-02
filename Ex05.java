import java.util.Scanner;

public class Ex05 {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadepar = 0;
		int quantidadeimpar = 0;
		final int TAM= 20;
		int pospar=0;
		int posimpar=0;
		
		int [] num=new int [TAM];
		
		for( int i = 0; i < TAM; i++) {
			System.out.println("Digite um número: ");
		    num[i] = entrada.nextInt();
		}   
		
		System.out.println("Vetor: ");
		for(int i = 0; i < TAM; i++) {
		  if (num[i] % 2 == 0) {
			  quantidadepar ++;
		  }
		  else if(num[i] % 2 != 0) {
			  quantidadeimpar++;
		  }
		  System.out.println(num[i]+" ");
		}
		int[] pares = new int [quantidadepar];
		int[] impares = new int [quantidadeimpar];
		
		for(int i = 0; i < TAM; i++) {
			if (num[i] % 2 == 0) {
				pares[pospar] = num[i];
				pospar++;
			}
			else if(num[i] % 2 != 0) {
			 impares[posimpar] = num[i];
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
