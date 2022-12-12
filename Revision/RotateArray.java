import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        k = k%nums.length;
        rotate(nums, k);
    }
    public static void rotate(int[] nums, int k){
        swap(nums, 0, nums.length-1);
        System.out.println("1st swap -> "+Arrays.toString(nums));
        swap(nums, 0, k-1);
        System.out.println("2nd swap -> "+Arrays.toString(nums));
        swap(nums, k, nums.length-1);
        System.out.println("3rd swap -> "+Arrays.toString(nums));
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums, int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    // public static void rotate(int[] nums, int k){
    //     int[] result = new int[nums.length];
    //     int index = 0;
    //     for(int i=nums.length-k;i<nums.length;i++){
    //         result[index] = nums[i];
    //         index++;
    //     }
        
    //     for(int i=0;i<nums.length-k;i++){
    //         result[index] = nums[i];
    //         index++;
    //     }

    //     System.out.println(Arrays.toString(result));
    // }
}
