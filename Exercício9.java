import java.util.Scanner;
import java.util.Random;
public class Exercício9 {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		Random aleatorio=new Random();
		
		int tamsenha = 0,x;
		char randomSenha;
		String senha="";
		
		char[] vetor= new char [] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
				'q','r','s','t','u','v','w','y','x','z'}; 
		
		do {
		System.out.println("Insira a quantidade de letras que você quer na sua senha:");
		tamsenha=entrada.nextInt();
		}
		while (tamsenha>vetor.length);
		
		for(x=0;x<tamsenha;x++) {
			if (x%2==0) {
				do {	
					randomSenha=vetor[aleatorio.nextInt(26)];
				}while (randomSenha=='a'||randomSenha=='e'||randomSenha=='i'||randomSenha=='o'||randomSenha=='u');
				senha=senha+randomSenha;
			}
			else {
				
				do {
				randomSenha=vetor[aleatorio.nextInt(26)];
				}
				while(randomSenha!='a'&& randomSenha!='e'&& randomSenha!='i'&& randomSenha!='o'&& randomSenha!='u');
				senha=senha+randomSenha;
		}
}
			
		System.out.println("Senha: "+senha);
			
		entrada.close();
					
}
}


