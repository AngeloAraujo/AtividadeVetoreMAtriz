import java.util.Scanner;

public class Exe07 {

  public static void main(String[] args) {
   
	  Scanner entrada = new Scanner(System.in);

    final int num = 5; 
    int vetor[] = new int[num]; 
    int mult = 1; 
    int soma = 0;
    
    
    for (int i=0; i<num; i++) {
    	System.out.printf("Informe %2do. valor de %d: ", (i+1), num);
    		vetor[i] = entrada.nextInt();
    }

    for (int i=0; i<num; i++) {
    	soma = soma + vetor[i];
    		mult=mult*vetor[i];
    }
    
    System.out.println("Os n�meros digitados foram: ");
    for(int i=0; i<num;i++) {
    	System.out.print(vetor[i]+ " | ");
    }
    
    System.out.println();
    System.out.println("A soma dos 5 n�meros digitas foi: "+ soma);
    System.out.println("A multiplica��o dos 5 n�meros �: "+mult);
    
    entrada.close();
  }

}
