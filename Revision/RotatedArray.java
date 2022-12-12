import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {
        int[] nums = {11,11,1,20};
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums){

        String original = "";
        for(int i=0;i<nums.length;i++){
            original+=nums[i];
        }

        int[] duplicateNums = nums;
        Arrays.sort(duplicateNums);
        String duplicate = "";
        for(int i=0;i<duplicateNums.length;i++){
            duplicate+=duplicateNums[i];
        }
        duplicate+=duplicate;
        // System.out.println(duplicate);
        
        for(int i=0;i<duplicate.length();i++){
            if(duplicate.contains(original)){
                return true;
            }
        }return false;

    }
}

