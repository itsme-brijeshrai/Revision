// package Assignments;
import java.util.Scanner;

public class qq {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of matrix");
        int n=in.nextInt();
        System.out.println("enter your 2d array numbers");
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        //find the element present in the 2d array and return the index.
        System.out.println("Enter the target to find in the 2d array");
        int target = in.nextInt();
        findElement(n,matrix,target);
        in.close();
    } 
    static void findElement(int n, int[][]matrix, int target){
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==target){
                    System.out.println(i+","+j);
                    flag=true;
                }
            }
        }if(!flag){
            System.out.println("Try another number");
        }
    }   
}