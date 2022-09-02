
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	final int TAM =3;
	int vetor[] = new int [TAM];
	
	
	System.out.println("Digite uma data no formato dd/mm/aaaa: ");
	System.out.println("Dia:");
	int dia = entrada.nextInt();
	System.out.println("Mês:");
	int mes = entrada.nextInt();
	System.out.println("Ano:");
	int ano = entrada.nextInt();
	
	int[] datacompleta = {dia,mes,ano}; 
	
				
	for (int i=0; i<TAM;i++) {
			
	if ((dia == 0) || (dia > 31) || ((mes == 0) || (mes > 12)) || (ano  < 0)||  ((dia==30) && (mes==2))) {
			System.out.println("Data inválida.");
	}else if((dia >= 1) && (dia <= 31)&&(mes >= 1) && (mes <= 12)&&(ano  > 0)) {
		vetor[i]= datacompleta[i];
		System.out.println("Posição "+ (i+1)+" :"+vetor[i]);
		}		
		
	}
	entrada.close();
	}

}
