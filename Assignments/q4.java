// package Assignments;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int n = in.nextInt();
        System.out.println("Enter the numbers");
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        in.close();
        //find minimum element present in the array.
        System.out.println(minimum(array));
    }
    static int minimum(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }return min;
    }
}
