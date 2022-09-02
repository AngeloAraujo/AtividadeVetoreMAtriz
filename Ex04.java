import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		final int TAM=5;
		char vetor[] = new char [TAM];
		int cont = 0;
		
		for(int i = 0; i < TAM; i++) {
			System.out.println("Insira as letras:" );
			vetor[i]= entrada.next().charAt(0);
					cont++; 	
			}	
		
		System.out.println("As consoantes são: ");
		
		for(int i=0; i<TAM; i++) {
			if((vetor[i] != 'a') && (vetor[i] != 'e') && (vetor[i] != 'i') && (vetor[i] != 'o') && (vetor[i] != 'u')){
				System.out.print( vetor [i]+ " , ");
		}
		}
		System.out.println();
		System.out.println("Há "+ cont+ " de consoantes. ");
	
		entrada.close();	
	}
	
}