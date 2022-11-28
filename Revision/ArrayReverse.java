import java.util.*;
import java.util.LinkedList;


public class ArrayReverse {
    public static void main(String[] args) {
        Integer[] arr =  {1,2,3,4,5,6,7};
        List<Integer> l = new LinkedList<>();
        l=Arrays.asList(arr);
        Collections.reverse(l);
        System.out.println(l);

        // int max = l.stream().max(Integer::compare).get();
        // int min = l.stream().min(Integer::compare).get();
        // System.out.println(max);
        // System.out.println(min);

        String[] string = {"BrijeshRai","Anubhav","Shubham","Gaurav"};
        List<String> list = new Vector<>();
        list=Arrays.asList(string);
        String MAX = list.stream().max(Comparator.comparing(String::length)).get();
        String MIN = list.stream().min(Comparator.comparing(String::length)).get();
        System.out.println(MAX);
        System.out.println(MIN);
    }
}
