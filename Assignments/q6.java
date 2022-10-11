// package Assignments;

import java.util.Arrays;

public class q6 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,34,67,98};
        //find the smallest element in the array which is greater than or equal to the target.
        int target = 35;
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else if (target==arr[mid] || target>=arr[mid]){
                return mid;
            }
        }return -1;
    }
}
