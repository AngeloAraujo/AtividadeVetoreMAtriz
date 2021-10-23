import java.util.Scanner;
public class Exercício1 {


	public static void main(String[] args) {
			
	Scanner entrada = new Scanner(System.in);
			
	int vetor[] = new int [5];
	int i;
		
		for(i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = entrada.nextInt();		
			}
		
		for(i = 0; i <5; i++) {
			System.out.print(vetor[i] + " ");
		
		}
		entrada.close();
}
		
}
