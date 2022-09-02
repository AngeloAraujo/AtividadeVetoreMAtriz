import java.util.Scanner;

public class Ex2 {

 
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	final int TAM= 5;
	float [] vetor = new float [TAM];
	
	for(int i=0; i<TAM;i++) {
		System.out.println("Insira os valores dos números reais: ");	
		vetor[i]= entrada.nextFloat();
	}
	
	for (int i=vetor.length-1; i>=0 ;i--) {
		System.out.print(vetor[i]+"|");
	}
	entrada.close();
}

}
			
			
	

