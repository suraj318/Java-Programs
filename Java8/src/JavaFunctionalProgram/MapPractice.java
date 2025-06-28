package JavaFunctionalProgram;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        
        Map<String,Integer> map= new LinkedHashMap<>();
        
        map.put("Geek1", 1);
        map.put("Geek2", 2);

        System.out.println(map.getOrDefault("a", 0  ));
        System.out.println(map.containsKey("Geek"));

    }

}
