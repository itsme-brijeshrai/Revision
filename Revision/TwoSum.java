import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2,5,5,11};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }
    public static int[] twoSum(int[] array, int target){
        int sum = 0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                sum = array[i]+array[j];
                // System.out.println(sum);
                if(sum==target){
                    return new int[]{i,j};
                }
            }
        }return null;
    }
}
