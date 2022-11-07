import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class String3 {
    public static void main(String[] args) {
        String[] string = {"BrijeshKumarRai","SakshiGupta","ChandaniChandra","VikasKumarGautam"};
        List<String> l = new ArrayList<>();
        for(String list:string){
            l.add(list);
        }
        Comparator<String> compByLength = (aName,bName)->aName.length()-bName.length();
        List<String> list = l.stream().sorted(compByLength).collect(Collectors.toList());
        System.out.println(list);
    }
}
