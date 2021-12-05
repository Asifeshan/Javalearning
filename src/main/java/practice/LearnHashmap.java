package practice;

import java.util.HashMap;

public class LearnHashmap {
    public void AddHashmapValue(){
        //    HashMap<data type, data type> any name = new Hashmap<>();
        HashMap<String,String> hmap = new  HashMap<>();
        hmap.put("IE","Internet Explorer");
        hmap.put("Chrome","Google Chrome");
        hmap.put("Firefox","Mozilla Firefox");
        hmap.put("Safari","Macbook Browser");
        System.out.println("Browser Name: " + hmap.get("IE"));
        System.out.println("Browser Name: " + hmap.get("Chrome"));
        System.out.println("Browser Name: " + hmap.get("Firefox"));
        System.out.println("Browser Name: " + hmap.get("Safari"));
        System.out.println(hmap);

    }
    public void hashMapProblems() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Vishal", 10);
        map.put("Sachin", 30);
        map.put("Shekar", 20);
        System.out.println("Size of the map: " + map.size());
//        check if a key is exist and if exist print the value
        if (map.containsKey("Vishal")){
            System.out.println(map.get("Vishal"));
        }
    }

}
