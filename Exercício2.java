
public class Exercício2 {

 
public static void main(String[] args) {
	
	float [] vetor = {(float) 1.5, (float) 3.6, (float) 5.4, (float) 7.5, (float) 3.7, 
						(float) 9.8, (float) 2.1, (float) 4.6, (float) 7.4, (float) 2.2};
					
	inverter(vetor);
	mostrar(vetor);
				
}
			
	private static void mostrar(float[] vetor) {
			for(float x : vetor) {
			System.out.print("'"+x + "'" );
	}
	}

	private static void inverter(float[] vetor) {
			float i, f;
			i = 0; f = vetor.length-1;
					
	while(i < f) {
		trocar(vetor, i, f);
			i++; 
				f--;
	}
	}


	private static void trocar(float[] vetor, float i, float f) {
			float aux = vetor[(int) i];
				vetor[(int) i] = vetor[(int) f];
					vetor[(int) f] = aux;
	}

}
			
			
	

