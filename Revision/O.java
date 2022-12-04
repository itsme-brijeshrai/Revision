import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class O {
    public static void main(String[] args) {
        int[] array = {23,45,56,78,5,65,101};
        List<Integer> list = new LinkedList<>();
        for(Integer i:array){
            list.add(i);
        }
        Comparator<Integer> comBySize = (a,b) -> a-b;
        List<Integer> l = list.stream().sorted(comBySize).collect(Collectors.toList());
        System.out.println(l.get(l.size()-3));
    }
}
