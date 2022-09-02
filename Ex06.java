import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
	Scanner entrada=new Scanner(System.in);
		
	
	final int tamaluno=2;
	final int tamanota=2;
	int alunos=0;
	float media = 0;
	float soma=0;
	float notas[]=new float[tamanota];
	
	for(int i=0; i<tamaluno;i++) {
	System.out.println("Insira as notas do aluno");
	
		for(int j=0;j<tamanota;j++) {
			System.out.printf("Nota: "+(j+1)+": ");
			notas[j]=entrada.nextFloat(); 
			soma=soma+notas[j];
			
						
	}
		media =soma/tamanota;
		System.out.println("Sua média é: "+media);
		soma=0;
	}
	
	if (media>=7) {
	 	alunos++;
	   }
	System.out.println("Alunos com média igual ou acima de 7: "+alunos+" alunos");
	entrada.close();
  	
	}
	}
	
