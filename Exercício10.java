import java.util.Scanner;
import java.util.Arrays;
public class Exercício10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira um texto: ");
		String texto = entrada.nextLine();

		char letras[] = new char[texto.length()];

		for (int k = 0; k < letras.length; k++) {
			letras[k] = texto.charAt(k);
		}

		System.out.println(Arrays.toString(letras));
		
		entrada.close();

	}
}



