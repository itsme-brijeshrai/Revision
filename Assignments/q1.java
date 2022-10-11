// package Assignments;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = in.nextInt();
        System.out.println("Enter numbers");
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        System.out.println("Enter target to find in array");
        int k = in.nextInt();
        in.close();
        if(findElementExistORnot(array,k)){
            System.out.println("Present");
        }else{
            System.out.println("Not persent");
        }
    }
    static Boolean findElementExistORnot(int[] array, int k){
        for(int i:array){
            if(i==k){
                return true;
            }
        }return false;
    }
}
