import java.util.Arrays;
import java.util.Scanner;
public class Exerc�cio12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe v�rias palavras: ");
		String palavras = entrada.next();
		String separadas[] = palavras.split(" ; ");
		
		System.out.println(Arrays.toString(separadas));
		
		entrada.close();
}
}