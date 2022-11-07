import java.util.Map;
import java.util.TreeMap;

public class StringDemo {
    public static void main(String[] args) {
        String[] str = {"coderbyte","brijesh","vikas"};
        Map<Integer,String>map = new TreeMap<>();
        for(int i=0;i<str.length;i++){
            map.put(str[i].length(),str[i]);
        }
        int count = map.size()-3;
        int flag = 0;
        for(Map.Entry m: map.entrySet()){
            if(flag==count){
                System.out.println(m.getValue());
            }
            flag++;
        }
        
    }
}
