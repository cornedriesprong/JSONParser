import java.util.ArrayList;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class Docent {
    public String naam;
}

public class Main {
    public static void main(String[] args) {
//        ArrayList<Docent> docenten;
        JSONParser parser = new JSONParser();
        try (FileReader fileReader = new FileReader("data.json")) {
            Object obj = parser.parse(fileReader);
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray docenten = (JSONArray)jsonObject.get("docenten");
            for (int i = 0; i < docenten.length(); i++) {
                Docent docent = (Docent)docenten.get(i);
                System.out.println(docent);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}