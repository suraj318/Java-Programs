package JavaFunctionalProgram.CollectionFramework;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

class ListCollection{
    public static List<Integer> num=Arrays.asList(1,2,3,4,5,6,8,9,5,3,2,1,23,54,6);
    
}
public class CollectionQuestions1 {
    public static void reverse(){
        //Reverse an ArrayList with using Collections.reverse()
        ArrayList<Integer> num1=new ArrayList<>(ListCollection.num);
        System.out.println(num1);

        System.out.println("Reverse Order: ");
        Collections.reverse(num1);
        //Collections.sort(num1,Comparator.reverseOrder());
        System.out.println(num1);

        //Reverse an ArrayList without using Collections.reverse()
        for(int i=num1.size()-1;i>=0;i--){
            System.out.print(num1.get(i)+ " ");
        }
    }
    public static void MaxMin(){
        //Find the Maximum and Minimum values in a List
        System.out.println(ListCollection.num);
        System.out.println("Max : "+Collections.max(ListCollection.num));
        System.out.println("Min : "+Collections.min(ListCollection.num));
    }

    public static void DuplicateRemove(){
        // Remove Duplicates from an ArrayList using Set
        ArrayList<Integer> list = new ArrayList<>(ListCollection.num);
        System.out.println("List With Duplicate : \n"+list);
        Set<Integer> set= new HashSet<>(list);
        System.out.println("List Without Duplicate : \n"+set); 
    }

    public static void HashMapPrint(){
        //Iterate Over a HashMap and Print Keys and Values
        Map<String, String> map=new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cat");

        for(Map.Entry<String, String> e: map.entrySet()){
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }

    public static void sortArrayList(){
        //Sort an ArrayList of Integers
        ArrayList<Integer> arr=new ArrayList<>(ListCollection.num);
        System.out.println("Before Sort : \n"+arr);
        Collections.sort(arr);
        System.out.println("After Sort : \n"+arr);
    }

    public static void mergeAndRemoveDuplicateList(){
        List<Integer> n1=Arrays.asList(1,2,3);
        System.out.println("n1 : "+n1);
        List<Integer> n2=Arrays.asList(3,4,5);
        System.out.println("n2 : "+n2);
        
        Set<Integer> s1=new HashSet<>(n1);
        s1.addAll(n2);
        System.out.println("s1 : "+s1);

    }

    public static void SortMapByValue(){
        //Sort a HashMap by Values
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 3);
        map.put("C", 8);
        System.out.println(map);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
    public static void LinkedHashSetExample(){
        List<Integer> list=new ArrayList<>(ListCollection.num);
        System.out.println(list);
        Set<Integer> set= new LinkedHashSet<>(list);
        System.out.println(set);

    }

    public static void removeNullValues(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,null,3,5,7,null));
        System.out.println(list);
        list.removeIf(Objects::isNull);
        System.out.println(list);
    }
    public static void unModifiedList(){
        List<Integer> list= Collections.unmodifiableList(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        
        try {
            list.add(56);
        } catch (UnsupportedOperationException e) {
            System.err.println(e.toString());
        }
    }

    public static void findDuplicate(){
        List<Integer> list= Arrays.asList(3,5,7,9,3,2,2);
        Set<Integer> dup=new HashSet<>();
        System.out.println(dup.add(2)); //true
        System.out.println(dup.add(2)); //false
        int count=1;
        for(int n:list){
            if(!dup.add(n)){
                System.out.println( count +" - "+ " Duplicate Found : "+n);
                count++;
            }
        }
    }   
    public static void FirstNonRepeatingCharacter(String s){
            Map<Character,Integer> map=new LinkedHashMap<>();
            for(char c: s.toLowerCase().toCharArray()){
                map.put(c,map.getOrDefault(c, 0)+1);
            }
            System.out.println(map);
            
            for (Map.Entry<Character,Integer> m : map.entrySet()) {
                if(m.getValue()==1){
                    System.out.println(m.getKey());
                    break;
                }
            }
    }

    public static void main(String[] args) {
    //reverse();
    //MaxMin();
    //DuplicateRemove();
    //HashMapPrint();
    //sortArrayList();
    //mergeAndRemoveDuplicateList();
    //SortMapByValue();
    //LinkedHashSetExample();
    //removeNullValues();
    //unModifiedList();
    //findDuplicate();
    FirstNonRepeatingCharacter("Ssurajj");
}
}
