import java.util.Scanner;

public class Exercício7 {

	public static void main(String[] args) {
		
	Scanner entrada=new Scanner(System.in);
		
	
	final int tamaluno=2;
	final int tamanota=2;
	int x,k= 0,alunos=0;
	float media = 0, soma=0;
	
	
	for (k=0;k<tamaluno;k++) {
		System.out.println("Insira as notas do aluno");
	
	
	float notas[]=new float[tamanota];
			for(x=0;x<tamanota;x++) {
					System.out.printf("Nota "+(x+1)+": ");
					notas[x]=entrada.nextFloat(); 
						soma=soma+notas[x];
						
	}
	media =soma/tamanota;
		soma=0;
			System.out.println("Sua média é: "+media);		

	
	
	if (media>=7) {
	 	alunos++;
	   }  
    }
  	System.out.println("Alunos com média igual ou acima de 7: "+alunos+" alunos");
entrada.close();
	}
	}
	
