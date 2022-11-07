import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class String2 {
    public static void main(String[] args) {
        String[] str = {"Brijesh","Vikas","Chandani","Sakshi"};
        List<String> l = new ArrayList<>();
        for(String list :str){
            l.add(list);
        }
        Comparator<String> comByLength = (aName,bName)-> aName.length()-bName.length();
        List<String> list= l.stream().sorted(comByLength).collect(Collectors.toList());
        System.out.println(list.get(l.size()-3));
    }
}
