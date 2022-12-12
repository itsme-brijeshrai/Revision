import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Entity;

public class MaxOccurance {
    public static void main(String[] args) {
        String string = "adwahdbeideifyevbsiivseivc";
        char[] ch = string.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        
        for(char c:ch){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }

        Integer maxCharCount = Collections.max(map.values());
        char maxCharacter = Character.MIN_VALUE;

        for(Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue)
        }

        for(Map.Entry m: map.entrySet()){
            System.out.println();
        }
    }
}
