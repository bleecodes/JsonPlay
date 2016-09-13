package nyc.c4q;

import jdk.nashorn.api.scripting.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import sun.java2d.cmm.Profile;

import java.util.Collection;
import java.util.Set;

/**
 * Created by BLEED on 9/12/2016.
 */
public class Jparser {
    private String id;
    private String name;
    private Profile2 profile2;
    private Boolean is_Admin;
    private Field[] fields;


    public void getData(JSONObject obj){
        //if( "name".equals((String)obj.get("name"))){
        this.name = (String) obj.get("name");
        System.out.println(name);

    }

    public Profile2 getProfile2 (){
        return profile2;
    }


    public void getData3(JSONObject obj){
        JSONObject profile = (JSONObject)obj.get("profile");
        Profile2 profileObj = new Profile2(String.valueOf(profile.get("skype")),(String)profile.get("phone"));
        System.out.println(profileObj.getPhone());
    }
    public void getData2(JSONObject obj){
        //if( "name".equals((String)obj.get("name"))){
        JSONArray fields = (JSONArray)obj.get("fields");
    }



    }

