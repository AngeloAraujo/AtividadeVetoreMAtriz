import java.util.Scanner;

public class Exercício16 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		final int TAM = 5;
		int valor[] = new int [TAM];
		
		for (int i = 0; i < TAM; i++) {
		do {
			System.out.println("Informe um valor de 0 a 20: ");
			valor[i] = entrada.nextInt();
	
		} while ((valor[i] < 0) || (valor[i] > 20)); 
		}
		
		String texto = "#";
		
		for (int i = 0; i < TAM; i++) {
			System.out.println(valor[i] + ": " + texto.repeat(valor[i]));
		}

		entrada.close();

	}

}
