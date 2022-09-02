import java.util.Scanner;
import java.util.Arrays;
public class Ex09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira um texto: ");
		String texto = entrada.nextLine();

		char letras[] = new char[texto.length()];

		for (int i = 0; i < letras.length; i++) {
			letras[i] = texto.charAt(i);
		}

		System.out.println(Arrays.toString(letras));
		
		entrada.close();

	}
}



