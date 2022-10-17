public class q12 {
    public static void main(String[] args) {
        int[] arr = {5,5,1,-6,-7,2,4};
        //find the maximum two sum in the array.
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(maxSum<arr[i]+arr[j]){
                    maxSum=arr[i]+arr[j];
                }
            }
        }System.out.println(maxSum);
    }
}
