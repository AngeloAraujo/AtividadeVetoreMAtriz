
public class Exerc�cio5 {

	public static void main(String[] args) {
		
		char vetor[] = {'d', 'e', 'f','g', 'e', 'i', 'j', 'k', 'l','o'};
		int cont = 0;
		int j;
		
		System.out.print("�s consoantes s�o: ");
		for(j = 0; j < 10; j++) {
			if((vetor[j] != 'a') && (vetor[j] != 'e') && (vetor[j] != 'i') && (vetor[j] != 'o') && (vetor[j] != 'u'))  {
					cont++; 
					System.out.print( vetor[j] + " ");
			}	
		}
		System.out.println();
		System.out.println("H� "+ cont+ " de consoantes. ");
		
	}

}