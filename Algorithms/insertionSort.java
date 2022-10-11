import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = in.nextInt();
        System.out.println("Enter numbers");
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        in.close();
        insertion(array);
        System.out.println(Arrays.toString(array));
    }
    static void insertion(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    swap(array, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first]=array[second];
        array[second]=temp;
    }
}

//Time complexity - Worst case - O(n^2);    Best Case - O(N)