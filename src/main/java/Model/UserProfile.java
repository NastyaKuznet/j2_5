package Model;

import java.io.Serializable;

public class UserProfile{
    private final String login;
    private final String email;
    private final String password;

    public UserProfile(String login, String email, String password){
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public String getLogin(){
        return login;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

}
