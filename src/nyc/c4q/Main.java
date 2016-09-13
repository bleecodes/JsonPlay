package nyc.c4q;

import netscape.javascript.JSException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.omg.CORBA.Object;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.Buffer;

public class Main {
    public static void whereTheAmI(){System.out.println("Working Directory = "+ System.getProperty("user.dir"));}

    public static void main(String[] args) throws FileNotFoundException {
        whereTheAmI();
        Jparser data = new Jparser();
        JSONParser parser = new JSONParser();
        JSONObject exercise_obj = null;
        JSONObject exercise2_obj = null;

        try {
            exercise_obj = (JSONObject) parser.parse(new FileReader("C:/Users/BLEED/Desktop/AccessCode/LibraryPlay/exercise1.json"));
            exercise2_obj = (JSONObject) parser.parse(new FileReader("C:/Users/BLEED/Desktop/AccessCode/LibraryPlay/excercise2.json"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        data.getData(exercise_obj);
        data.getData(exercise2_obj);
        data.getData3(exercise_obj);
        Profile2 holder = data.getProfile2();
        System.out.println(holder.getPhone());





//    String jsonData = "";
//        BufferedReader br = null;
//        try {
//            String line;
//            br = new BufferedReader(new FileReader("C:/Users/BLEED/Desktop/AccessCode/LibraryPlay/exercise1.json"));
//            while ((line = br.readLine()) != null) {
//                jsonData += line + "\n";
//            }
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try{
//                if (br != null)
//                    br.close();
//            } catch(IOException ex){
//                ex.printStackTrace();
//            }
//        }

//        System.out.println("File Content: \n" +jsonData);


    }

}

