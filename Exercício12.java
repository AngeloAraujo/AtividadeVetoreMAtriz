import java.util.Arrays;
import java.util.Scanner;
public class Exercício12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe várias palavras: ");
		String palavras = entrada.next();
		String separadas[] = palavras.split(" ; ");
		
		System.out.println(Arrays.toString(separadas));
		
		entrada.close();
}
}