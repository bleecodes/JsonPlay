package nyc.c4q;

import org.json.simple.JSONObject;

/**
 * Created by BLEED on 9/12/2016.
 */
public class Profile2 {
     private String skype;
     private String phone;

//    public Profile() {
//    }
    public Profile2 (String skype, String phone){

        this.skype = skype;
        this.phone = phone;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
