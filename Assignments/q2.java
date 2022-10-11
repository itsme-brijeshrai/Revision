// package Assignments;

import java.util.Scanner;
//search in the array: return the index of the array if the item found, if not return -1.
public class q2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = in.nextInt();
        System.out.println("Enter numbers");
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        System.out.println("Enter element to find in array");
        int k = in.nextInt();
        System.out.println(retrunIndexOfElement(array,k));
        in.close();   
    }
    static int retrunIndexOfElement(int[] array, int k){
        if(array.length==0){
            return -1;
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==k){
                return i;
            }
        }return -1;
    }
}
