
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of the array ");
        int n = in.nextInt();
        System.out.println("Add numbers to your array");
        int[] array = new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=in.nextInt();
        }
        System.out.println("Enter the target value to find in the array");
        int target = in.nextInt();
        in.close();
        bubbleSort(array);
        System.out.println("index number of your target is "+binary(array,target));
    }
    static int binary(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int middle = start+(end-start)/2;
            if(target<array[middle]){
                end=middle-1;
            }else if(target>array[middle]){
                start=middle+1;
            }else{
                return middle;
            }
        }
        return -1;
    }
    static void bubbleSort(int[] array){
        boolean swapped;
        for(int i=0;i<array.length;i++){
            swapped = false;
            for(int j=1;j<array.length-i;j++){
                if(array[j]<array[j-1]){
                    swap(array, i, j);
                    swapped = true;
                }
            }if(!swapped){
                break;
            }
        }
    }
    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first]=array[second];
        array[second]=temp;
    }
}
