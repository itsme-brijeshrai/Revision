import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        String string = "mmaassaaii";
        Set<Character> set = new LinkedHashSet<>();
        for(Character c:string.toCharArray()){
            set.add(c);
        }
        for(Character c:set){
            System.out.print(c);
        }
    }
}
