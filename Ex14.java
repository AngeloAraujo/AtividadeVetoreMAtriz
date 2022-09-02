import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);
		
		final int TAM = 30;
		int idade[] = new int [TAM];
		float altura[] = new float [TAM];
		float soma = 0; 
		
		
		
		for (int i = 0; i < TAM; i++) {
		System.out.print("Informe sua idade: ");
		idade [i]= entrada.nextInt();
		System.out.print("Informe sua altura: ");
		altura [i] = entrada.nextFloat();
		soma = soma + altura[i];
			}
		
		float mediaaltura = (soma/TAM);
		int qtdalunos = 0;
		 
		for (int i = 0; i < TAM; i++) {
			if ((idade[i] > 13) && (altura[i] < mediaaltura)) {
				qtdalunos = qtdalunos + 1;
			}
		}
		
		System.out.println("A quantidade de alunos com mais de 13 anos e altura inferior à média é: "+qtdalunos);
		
		entrada.close();
	}

}
