package Service;

import Model.UserProfile;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AccountService implements Serializable {
    private static Map<String, UserProfile> loginToPtofile = new HashMap<String, UserProfile>(){{put("a", new UserProfile("a", "a","a"));}};

    public static void addNewUser(UserProfile user){
        loginToPtofile.put(user.getLogin(), user);
        //LoadService.loadOut(loginToPtofile);
    }
    public  static void addUsers(Map<String, UserProfile> users){
        loginToPtofile = users;
    }

    public static UserProfile getUserByLogin(String login){
        return loginToPtofile.get(login);
    }

}
