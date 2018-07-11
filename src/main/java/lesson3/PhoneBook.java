package lesson3;

import java.util.*;

public class PhoneBook {

    private Map<String, List<Integer>> data = new HashMap<String, List<Integer>>();

    public void add(String name, Integer phone){
        if (data.containsKey(name)){
            data.get(name).add(phone);
        } else {
            data.put(name, new ArrayList<Integer>(Collections.singletonList(phone)));
        }
    }

    public List<Integer> get(String name){
        return data.containsKey(name) ? data.get(name) : new ArrayList<Integer>();
    }

    public Map<String, List<Integer>> getData() {
        return data;
    }

    public void setData(Map<String, List<Integer>> data) {
        this.data = data;
    }
}
