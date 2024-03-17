package Service;

import Model.UserProfile;

import java.io.*;
import java.util.Map;

public class LoadService {
    public static void loadOut(Map<String, UserProfile> loginToPtofile){
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\p\\d.data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(loginToPtofile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void loadIn(){
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\user\\p\\d.data");
            ObjectInputStream ois = new ObjectInputStream(fis);
            AccountService.addUsers((Map<String, UserProfile>)ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
