package org.launchcode.data;

import org.launchcode.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {
    private static Map<Integer, User> users = new HashMap<>();

    public static Collection<User> getAll(){
        return users.values();
    }

    public static void add(User user){
        users.put(user.getId(), user);
    }

    public static User getById(Integer id){
        return users.get(id);
    }

    public static void remove(Integer id){
        if(users.containsKey(id)){
            users.remove(id);
        }
    }
}
