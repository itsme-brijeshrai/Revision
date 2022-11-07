import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class String4 {
    public static void main(String[] args) {
        String[] str = {"abcdefgt","defg","hijkl","mnopqr"};
        List<String> l = new LinkedList<>();
        for(String list:str){
            l.add(list);
        }
        Comparator<String> comByLength = (aName,bName)->aName.length()-bName.length();
        List<String> list = l.stream().sorted(comByLength).collect(Collectors.toList());
        System.out.println(list);
    }
}
