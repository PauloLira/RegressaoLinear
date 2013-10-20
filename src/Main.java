import java.io.Console;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		 
		List<Apartamento> aps = new ArrayList<Apartamento>();
		Console entradaConsole = null;
		try {
			aps = Data.jsonToObject();
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o tamanho desejado: ");
			Integer valor = sc.nextInt();
			Calculos.CalculoFinal(aps, valor);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
