package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// out of list find the elements which are even.
public class q1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9,10);
        List<Integer> finalList = new ArrayList<>();
        //by using linear search

        // for(int i=0;i<list.size();i++){
        //     if(list.get(i)%2==0){
        //         finalList.add(list.get(i));
        //     }

        //using for each
            // for(Integer i:list){
            //     if(i%2==0){
            //         finalList.add(i);
            //     }
            // }
            // System.out.println(finalList);

        //using streams
        finalList=list.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println(finalList);

        }

    }
