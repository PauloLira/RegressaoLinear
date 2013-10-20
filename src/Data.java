import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class  Data {
	
	private static JsonParser parser = new JsonParser();	
	
	public static List<Apartamento> jsonToObject() throws FileNotFoundException {
		List<Apartamento> apartamentos = new ArrayList<Apartamento>();
		JsonArray jApartamentos = (JsonArray) parser.parse(new FileReader("apartamentos.json"));
		
		for(Object o: jApartamentos){
			JsonObject ap = (JsonObject) o;
			Apartamento apartamento = new Apartamento(); 
			apartamento.setM2(Float.parseFloat(ap.get("m2").getAsString()));
			apartamento.setValor(Float.parseFloat(ap.get("valor").getAsString()));
			System.out.println(apartamento.toString());
			apartamentos.add(apartamento);
			
		}	
		
		System.out.println("Numero de Aps: "+apartamentos.size());
		return apartamentos;
	}
	
	 
	
	
	
 
	
	
	
	
	
}
