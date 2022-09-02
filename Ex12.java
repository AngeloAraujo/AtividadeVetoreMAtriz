import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		final int TAM = 3;
		int vetoridade[] = new int [TAM];
		float vetoraltura[] = new float [TAM];
		int menoridade = 99;
		int maioridade = 0; 
		int idadeinversa=0;
		int	idademaisbaixo=0;
		int idademaisalto=0;
		float alturainversa=0;
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
		float alturamaisnovo=0;
		float alturamaisvelho=0;
		
		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite sua idade: ");
				vetoridade[i] = entrada.nextInt();
			System.out.print("Informe sua altura: ");
				vetoraltura[i] = entrada.nextFloat();
			
	
		somaAltura = somaAltura + vetoraltura[i];
		somaIdade = somaIdade + vetoridade[i];
		
		}
			
		mediaaltura = somaAltura / TAM;
		mediaIdade = somaIdade / TAM ;
	
			
		for (int i = 0; i < TAM; i++) {
			if (i==0) {
				maioridade=vetoridade[i];
				alturamaisvelho=vetoraltura[i];
				menoridade=vetoridade[i];
				alturamaisnovo= vetoraltura[i];	
			} 
		
			else {
				if (vetoridade[i] < menoridade) {
					menoridade = vetoridade[i];
				    alturamaisnovo= vetoraltura[i];
				}
				
				if (vetoridade[i] > maioridade) {
					maioridade = vetoridade[i];
					alturamaisnovo= vetoraltura[i];
				}      
				
			}	
		}
		
		System.out.println("\nA pessoa mais nova tem: " +menoridade+" e a sua altura é "+ alturamaisnovo+ ".");
    	System.out.println("A pessoa mais velha tem: " +maioridade+" e a sua altura é "+ alturamaisvelho+ ".");

			
        for ( int i = 0; i < TAM; i++) {
        	if (i==0) {
				maioraltura=vetoraltura[i];
				idademaisalto=vetoridade[i];
				menoraltura=vetoraltura[i];
				idademaisbaixo=vetoridade[i];
			} 
			else {        	
        		if (vetoraltura[i] < menoraltura) {
					menoraltura = vetoraltura[i];
					idademaisbaixo=vetoridade[i];
				}
				if (vetoraltura[i] > maioraltura) {
					maioraltura = vetoraltura[i];
					idademaisalto=vetoridade[i];
				}
			}
        }
        System.out.println("A pessoa mais baixa tem: " +menoraltura+ "m."+" e a sua idade é "+idademaisbaixo);
    	System.out.println("A pessoa mais alta tem: " +maioraltura+ "m."+" e a sua idade é "+idademaisalto);
    	
		for (int i = 0; i < TAM; i++) {
			if (i==0) {
				mediaidadeabaixo=vetoridade[i];
				mediaidadeacima=vetoridade[i];
		} 
			else if (vetoridade[i] < mediaIdade) {
				mediaidadeabaixo = vetoridade[i];
            }
            else {
            	mediaidadeacima = vetoridade[i];
            }
		}
		
		for (int i = 0; i < TAM; i++) {
			if (i==0) {
				mediaaltabaixo=vetoraltura[i];
				mediaaltacima=vetoraltura[i];
			} 
			else if (vetoraltura[i] < mediaaltura) {
            	mediaaltabaixo = vetoraltura[i];
            }
            else {
            	mediaaltacima = vetoraltura[i];
            }
		}
		System.out.println("A idade das pessoas na ordem inversa é: ");
		for (int j = vetoridade.length - 1; j >= 0; j--) {
			idadeinversa=(vetoridade[j]);
			System.out.print(idadeinversa+",");
		}
			
		System.out.println("\nA altura das pessoas na ordem inversa é: ");
		for (int j = vetoraltura.length - 1; j >= 0; j--) {
			alturainversa=(vetoraltura[j]);
			System.out.print(alturainversa+",");
			
		}
		
		System.out.println();
        System.out.println("A altura que está acima da média é: "+mediaaltacima);
        System.out.println("As pessoas que estão abaixo da média de altura são: "+mediaaltabaixo);
        System.out.println("As pessoas que estão acima da média de idade são: "+mediaidadeacima);
        System.out.println("As pessoas que estão abaixo da média de idade são: "+mediaidadeabaixo);		

        entrada.close();

	}

}
