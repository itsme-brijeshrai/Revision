import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int n = 5, arr1[] = {1, 2, 3, 4, 5}; 
        int m = 3, arr2 [] = {1, 2, 3};
        findUnion(arr1,arr2);
    }
    static void findUnion(int[] arr1, int[] arr2){
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
