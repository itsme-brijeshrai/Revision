import java.util.*;
import java.util.stream.Collectors;

public class String5 {
    public static void main(String[] args) {
        String[] string = {"BrijeshRai","ShubhamRandive","YogeshBhatt","NrupulDev"};
        List<String> l = new Vector<>();
        for(String list:string){
            l.add(list);
        }
        Comparator<String> comByLength = (aName,bName)->aName.length()-bName.length();
        // String list = Arrays.stream(string).sorted(comByLength).skip(2).findFirst().get();
        List<String> list = l.stream().sorted(comByLength).collect(Collectors.toList());
        System.out.println(list.get(list.size()-3));
    }
}
