package JavaFunctionalProgram.CollectionFramework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapCollection {

    public static void main(String[] args) {
        
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"aaa");
        map.put(4,"aaa");
        map.put(3,"aaa");
        map.put(2,"aaa");
        map.put(5,"aaa");
        System.out.println(map);

        Map<Integer, String> syncMap=Collections.synchronizedMap(map);
        System.out.println("Sync Map: "+syncMap);

        Map<Integer,String> conMap=new ConcurrentHashMap<>(map);
        conMap.put(6, "Con");
        //conMap.put(7, null); //Error
        System.out.println(conMap);


        

    }

}
