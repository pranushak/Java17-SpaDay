package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    private int id;
    private static int nextId=1;
    @NotBlank(message = "This should not be blank")
    @Size(min=5,max = 15,message = "it should have min 5 and 15 characters")
    private String username;
    @Email
    private String email;
    @NotBlank
    @Size(max=6,message = "This should be max 6 characters")
    private String password;
    private String verify;

    public User() {
     this.id=nextId;
       nextId++;
    }

    public User(String username, String email, String password,String verify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify=verify;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = password;
        checkPassword(password,);
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public int getId() {
        return id;
    }

    private void checkPassword(String password,String verify){

        if(password!= null&&verify!=null && !(password.equals(verify))){

            this.verify= null;

        }
    }
}

