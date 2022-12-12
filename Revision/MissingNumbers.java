import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumbers(nums));
    }
    static int missingNumbers(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int total = 0;
        int sum =0;
        for(int i=0;i<n;i++){
            total+=nums[i];
            sum+=i+1;
        }
        return sum-total;
    }
}
