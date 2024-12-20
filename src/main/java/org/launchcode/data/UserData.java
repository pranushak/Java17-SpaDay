package org.launchcode.data;

import org.launchcode.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {
    private static final Map<Integer, User> userList = new HashMap<>();

    public static Collection<User> getAllUsers() {
        return userList.values();
    }

    public static User getUserById(Integer id){
        return userList.get(id);
    }

    public static void addUser(User user){
        userList.put(user.getId(), user);}
    public static void deleteUserById(Integer id){

        userList.remove(id);
    }
}
