import java.util.Scanner;

public class q10{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,4,1,3,5,7,5,7,11,8,12,14};
        in.close();
        findTheMiddleElement(arr);
    }
    static void findTheMiddleElement(int[] arr){
        int n = arr.length;
        int max = arr[0];
        int result = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                if(result==-1 && i<n){
                    result=arr[i];
                }
            }else{
                if(arr[i]<result){
                    result=-1;
                }
            }
        }System.out.println(result);

    }
}

