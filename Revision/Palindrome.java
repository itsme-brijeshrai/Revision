import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        int[] array = {8,5,2,9,6,3};
        selection(array);
        System.out.println(Arrays.toString(array));

    }
    static void selection(int[] array){
        for(int i=0;i<array.length;i++){
            int last = array.length-i-1;
            int maxIndex = getMaxIndex(array, 0, last);
            swap(array, maxIndex, last);
        }
    }
    static void swap(int[] array, int first, int last){
        int temp = array[first];
        array[first]=array[last];
        array[last]=temp;
    }
    static int getMaxIndex(int[] array, int start, int end){
        int max = start;
        for(int i=0;i<=end;i++){
            if(array[max]<array[i]){
                max=i;
            }
        }return max;
    }
}
