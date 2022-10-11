// package Assignments;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = {12,34,56,87,32,54,74};
        in.close();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            if(max<n[i]){
                max=n[i];
            }
        }
        int secMax = Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            if(n[i]!=max){
                if(n[i]>secMax){
                    secMax=n[i];
                }
            }
        }
        System.out.println(secMax);
    }
}
