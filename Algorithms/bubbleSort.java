import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
    static void bubble(int[] array){
        boolean swapped;
        for(int i=0;i<array.length;i++){
            swapped = false;
            for(int j=1;j<array.length-i;j++){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = in.nextInt();
        System.out.println("Enter numbers");
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        in.close();
        bubble(array);
        System.out.println(Arrays.toString(array));
    }
}
