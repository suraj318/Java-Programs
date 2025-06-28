

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample1 {

    public static void main(String[] args) {
        
        List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,5,7,8));
        
        Iterator<Integer> it= list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
