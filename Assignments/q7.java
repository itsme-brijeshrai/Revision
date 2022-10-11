// package Assignments;

// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;

// import javax.naming.ldap.StartTlsRequest;

public class q7 {
    public static void main(String[] args) {
        String[] arr={"abc 5 5 6","xyz 8 9 10"};
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            String []strArr=str.split(" ");
            System.out.println(Arrays.toString(strArr));
            String name=strArr[0];
            int sum=0;
            for(int j=1;j<strArr.length;j++){
                sum=sum+Integer.parseInt(strArr[j]);
            }

            System.out.println(name+" "+sum/(strArr.length-1));
        }


    }
}
