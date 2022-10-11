// package Assignments;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string");
        String string = in.nextLine();
        System.out.println("Enter the character to find in your string");
        Character ch = in.next().charAt(0);
        if(findtheChar(string,ch)){
            System.out.println("Present");
        }else{
            System.out.println("Not present");
        }
        in.close();   
    }
    static boolean findtheChar(String string, Character ch){
        if(string.length()==0){
            return false;
        }
        // for(int i=0; i<string.length();i++){
        //     if(ch==string.charAt(i)){
        //         return true;
        //     }
        // }return false;
        int left = 0;
        int right = string.length()-1;
        while(left<=right){
            if(string.charAt(left)==ch){
                return true;
            }else if(string.charAt(right)==ch){
                return true;
            }else{
                left++;
                right--;
            }
        }return false;
    }
}
