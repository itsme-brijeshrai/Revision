import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class P {
    public static void main(String[] args) {
        String[] str = {"vikas","dharam","brijesh","sohail"};
        Integer[] array = {2,3,4,5,7,8,1};

        List<String> list = new LinkedList<>();
        for(String s:str){
            list.add(s);
        }
        Comparator<String> comByLength = (a,b) -> a.length()-b.length();
        List<String> l = list.stream().sorted(comByLength).collect(Collectors.toList());
        System.out.println(l.get(l.size()-3));
    }
}
