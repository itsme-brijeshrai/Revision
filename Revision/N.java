import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class N {
    public static void main(String[] args) {
        String[] string = {"brijesh","chandani","vikas"};
        List<String> list = new ArrayList<>();
        for(String l:string){
            list.add(l);
        }
        Comparator<String> compByLength = (aName,bName) -> aName.length()-bName.length();
        List<String> l = list.stream().sorted(compByLength).collect(Collectors.toList());
        System.out.println(l.get(l.size()-3));
    }
}
