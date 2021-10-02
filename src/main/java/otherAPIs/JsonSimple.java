package otherAPIs;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.io.FileReader;

public class JsonSimple {

    public static void main(String[] args) {
        createJsonObject();
        parseJsonFile();
    }
    public static void parseJsonFile(){
        Object ob = null;
        try {
             ob = new JSONParser().parse(new FileReader("jsonsimplefile.json"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        JSONObject jo = (JSONObject)ob;
        String firstName = String.valueOf(jo.get("firstName"));
        String lastName = String.valueOf(jo.get("lastName"));
        long l = (long) jo.get("age");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(l);


        Map address = (Map) jo.get("address");
        Iterator<Map.Entry> itr = address.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry pair = itr.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

       JSONArray ja = (JSONArray)jo.get("phoneNumbers");
       Iterator itr2 = ja.iterator();

       while(itr2.hasNext()){
        itr = ((Map)itr2.next()).entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry pair = itr.next();
            System.out.println(pair.getKey() +" "+ pair.getValue());
        }
       }



    }

    public static void createJsonObject(){
        JSONObject jo = new JSONObject();
        jo.put("firstName", "John");
        jo.put("lastName", "Smith");
        jo.put("age", 25);
      //You have to create Linked HashMap because JSONArray is ordered collection - preserves the order
        Map map = new LinkedHashMap<>(4);
        map.put("streetAddress", "21 2nd Street");
        map.put("city", "New York");
        map.put("state", "NY");
        map.put("postalCode", 10021);

        jo.put("address", map);

        JSONArray ja = new JSONArray();

        map = new LinkedHashMap(2);
        map.put("type", "home");
        map.put("number", "212 555-1234");

        ja.add(map);

        map = new LinkedHashMap(2);
        map.put("type", "fax");
        map.put("number", "212 555-1234");

        ja.add(map);

        jo.put("phoneNumbers", ja);

        try {
            writeJsonObjectToFile(jo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void writeJsonObjectToFile(JSONObject jo) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("jsonsimplefile.json");
        pw.write(jo.toJSONString());
        pw.flush();

    }
}
