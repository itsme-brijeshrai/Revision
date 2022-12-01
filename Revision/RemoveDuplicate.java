import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate{
    public static void main(String[] args) {
        String str = "brijeshraibri";
        Set<Character> set = new LinkedHashSet<>();
        for(Character c:str.toCharArray()){
            set.add(c);
        }
        for(Character c:set){
            System.out.print(c);
        }
        
    }
}