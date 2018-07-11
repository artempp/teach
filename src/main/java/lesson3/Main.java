package lesson3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Integer count = 1;
    private static final String NAME_ONE = "Oleg";
    private static final String NAME_TWO = "Dima";
    private static final String NAME_THREE = "Petr";
    private static final String NAME_FOUR = "Igor";
    private static final String NO_NAME = "Some name";

    public static void main(String[] args) {
        String[] words = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday",
                            "sunday", "monday", "tuesday", "wednesday", "tuesday", "wednesday", "June", "April" };
        HashMap<String, Integer> resultMap = new HashMap<String, Integer>();
        for(String word : words){
            resultMap.put(word, resultMap.containsKey(word) ? resultMap.get(word) + 1 : count);
        }
        for(Map.Entry<String, Integer> entry : resultMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(NAME_ONE, 7523891);
        phoneBook.add(NAME_ONE, 6569897);
        phoneBook.add(NAME_TWO, 3225512);
        phoneBook.add(NAME_TWO, 1233654);
        phoneBook.add(NAME_THREE, 2562547);
        phoneBook.add(NAME_FOUR, 1925235);

        System.out.println(NAME_ONE + " phone info: " + phoneBook.get(NAME_ONE));
        System.out.println(NAME_TWO + " phone info: " + phoneBook.get(NAME_TWO));
        System.out.println(NAME_THREE + " phone info: " + phoneBook.get(NAME_THREE));
        System.out.println(NAME_FOUR + " phone info: " + phoneBook.get(NAME_FOUR));
        System.out.println(NO_NAME + " phone info: " + phoneBook.get(NO_NAME));
    }
}
