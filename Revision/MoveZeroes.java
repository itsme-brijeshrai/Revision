import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Zeroes(nums);
    }
    static void Zeroes(int[] nums){
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
    
    }
}
