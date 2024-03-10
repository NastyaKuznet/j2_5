package Service;

import Model.UserProfile;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private static Map<String, UserProfile> loginToPtofile = new HashMap<>();
    private static Map<String, UserProfile> idSessionToProfile = new HashMap<>();

    public static void addNewUser(UserProfile user){
        loginToPtofile.put(user.getLogin(), user);
    }

    public static UserProfile getUserByLogin(String login){
        return loginToPtofile.get(login);
    }

    public static void addNewSession(String idSession, UserProfile user){
        idSessionToProfile.put(idSession, user);
    }
    public static UserProfile getUserBySession(String idSession){
        return idSessionToProfile.get(idSession);
    }

    public static void deleteSession(String idSession){
        idSessionToProfile.remove(idSession);
    }


}
