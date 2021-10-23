import java.util.Scanner;

public class Exercício8 {

  public static void main(String[] args) {
   
	  Scanner entrada = new Scanner(System.in);

    int num = 5; 
    int vetor[] = new int[num]; 
    int i, mult = 1; 
    int soma = 0;
    
    
    for (i=0; i<num; i++) {
    	System.out.printf("Informe %2do. valor de %d: ", (i+1), num);
    		vetor[i] = entrada.nextInt();
    }

    for (i=0; i<num; i++) {
    	soma = soma + vetor[i];
    		mult=mult*vetor[i];
    }
    

    System.out.println("A soma dos 5 números digitas foi: "+ soma);
    System.out.println("A multiplicação dos 5 números é: "+mult);
    
    entrada.close();
  }

}
