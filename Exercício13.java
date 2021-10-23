import java.util.Arrays;
import java.util.Scanner;
public class Exercício13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		final int TAM = 3;
		int idade[] = new int [TAM];
		float altura[] = new float [TAM];
		int menoridade = 99;
		int maioridade = 0;
		float maioraltura = 0;
		float menoraltura = 0;
		float mediaaltura = 0;
		float mediaIdade = 0;
		float somaAltura = 0;
		float somaIdade = 0;
		float mediaidadeacima = 0;
		float mediaidadeabaixo = 0;
		float mediaaltacima = 0;
		float mediaaltabaixo = 0;
		
		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite sua idade: ");
			idade[i] = entrada.nextInt();
			System.out.print("Informe sua altura: ");
			altura[i] = entrada.nextFloat();
			

		somaAltura = somaAltura + altura[i];
		somaIdade = somaIdade + idade[i];
		}
		
		mediaaltura = somaAltura / TAM;
		mediaIdade = somaIdade / TAM ;
		
		for (int i = 0; i < TAM; i++) {
			if (i==0) {
				maioridade=idade[i];
				menoridade=idade[i];
			} 
			
			else {
				if (idade[i] < menoridade) {
					menoridade = idade[i];
				}
				if (idade[i] > maioridade) {
					maioridade = idade[i];
				}            
		}
			System.out.println(i--);
		}
		
		
        for ( int i = 0; i < TAM; i++) {
        	if (i==0) {
				maioraltura=altura[i];
				menoraltura=altura[i];
			} 
			
			else {        	
        	
				if (altura[i] < menoraltura) {
					menoraltura = altura[i];
				}
				if (altura[i] > maioraltura) {
					maioraltura = altura[i];
        	}
        }
        }
		for (int i = 0; i < TAM; i++) {
			if (i==0) {
				mediaidadeabaixo=idade[i];
				mediaidadeacima=idade[i];
			} 
			
			else {
				
				if (idade[i] < mediaIdade) {
					mediaidadeabaixo = idade[i];
            }
            else {
            	mediaidadeacima = idade[i];
                }
		}
		}
		for (int i = 0; i < TAM; i++) {
			if (i==0) {
				mediaaltabaixo=altura[i];
				mediaaltacima=altura[i];
			} 
            if (altura[i] < mediaaltura) {
            	mediaaltabaixo = altura[i];
            }
            else {
            	mediaaltacima = altura[i];
                }
		}
        
        

            
        	System.out.println("Ordem lida: ");
        	System.out.println("As idades dos usuários são: "+Arrays.toString(idade));
        	System.out.println("As alturas dos usuários são: "+Arrays.toString(altura));
        	System.out.println("A pessoa mais baixa informada, tem: " +menoraltura+ "metro(s) de altura");
        	System.out.println("A pessoa mais alta informada, tem: " +maioraltura+ "metro(s) de altura");

			System.out.println("Ordem inversa: ");
			System.out.println("As alturas dos usuáriso são: "+Arrays.toString(altura));
			System.out.println("As idades dos usuários são: "+Arrays.toString(idade));
			System.out.println("A pessoa mais baixa informada, tem: " +menoraltura+ "metro(s) de altura");
        	System.out.println("A pessoa mais alta informada, tem: " +maioraltura+ "metro(s) de altura");
        	System.out.println("As pessoas que estão acima da média de altura são: "+mediaaltacima);
        	System.out.println("As pessoas que estão abaixo da média de altura são: "+mediaaltabaixo);
        	System.out.println("As pessoas que estão acima da média de idade são: "+mediaidadeacima);
        	System.out.println("As pessoas que estão abaixo da média de idade são: "+mediaidadeabaixo);
        	
		
		
		entrada.close();

	}

}
