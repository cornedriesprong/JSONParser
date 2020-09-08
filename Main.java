import java.util.ArrayList;
import java.util.Iterator;

import java.io.PrintWriter;
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

        ArrayList<Docent> docenten = new ArrayList<Docent>();
        JSONParser parser = new JSONParser();

        try (FileReader fileReader = new FileReader("data.json")) {
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < docenten.size(); i++) {
            System.out.println(docenten.get(i).naam);
        }
    }
}