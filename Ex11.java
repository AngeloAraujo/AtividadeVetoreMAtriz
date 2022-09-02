import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	
	System.out.print("Informe uma data: ");
		String data = entrada.next();
		String datacompleta[] = data.split("/");

    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        
    sdf.setLenient(false);
    try {
		sdf.parse(data);
	} catch (ParseException e) {
		e.printStackTrace();
	}
    System.out.println(Arrays.toString(datacompleta));
    System.out.println(data);
	
	entrada.close();
	}

}
