import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);
		
		final int TAM = 5;
		int [] vetor= new int [TAM];
		
		for(int i=0; i<TAM; i++) {
			System.out.println("Digite um número: ");
			vetor[i]= entrada.nextInt();
		}
		
		for (int i=0;i<vetor.length;i++) {
			System.out.print(vetor[i]+"|");
		}
		entrada.close();
	}

}
