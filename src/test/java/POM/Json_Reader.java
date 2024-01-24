package POM;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Reader {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader file = new FileReader(".\\src\\test\\resources\\Json_Reader.json");
		
		//json parser is used to read and Write data fromthe json fommeted file
		JSONParser jpar = new JSONParser();
		Object obj = jpar.parse(file);
		
		//read data from the json file
		JSONObject map = (JSONObject) obj;	//we are doing the explicit type casting because in json file our data is in key and value pair
		
		System.out.println(map.get("browser"));
		System.out.println(map.get("url"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
	}

}
