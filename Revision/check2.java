import java.util.Arrays;

public class check2 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int c = 0;
        for(int i=0;i<nums.length;++i){
            c = nums[(i+1) % nums.length];
            System.out.println(c);
        }
        
    }
}
