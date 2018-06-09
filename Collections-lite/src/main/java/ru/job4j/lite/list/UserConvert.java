package ru.job4j.lite.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Alexey Dvoryaninov on 23.05.18 - (lexxzone@gmail.com)
 */
public class UserConvert {

    public HashMap<Integer, User> process(List<User> list) {


        HashMap<Integer, User> hashMap = new HashMap<>();

        for (User singleUser : list) {

            hashMap.put(singleUser.getId(), singleUser);

        }

        for (Map.Entry<Integer, User> pair : hashMap.entrySet())
        {
            Integer key = pair.getKey();
            User value = pair.getValue();
            System.out.println(key + ":" + value.getName() + " " + value.getCity() );
        }


        return hashMap;
    }

    public static void main(String[] args) {
        UserConvert uc = new UserConvert();

        List list = new ArrayList<User>();

        list.add(new User(01, "Carl", "Moscow"));
        list.add(new User(02, "Alex", "SPb"));
        list.add(new User(03, "Troy", "Perm"));

        uc.process(list);
    }
//

}
