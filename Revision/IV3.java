public class IV3 {
    //find String Rotation
    public static void main(String[] args) {
        String string1 = "ABCD";
        String string2 = "CDAB";

        if(isRotation(string1, string2)){
            System.out.println("String 2 is rotatation of String1");
        }else{
            System.out.println("Not a rotation");
        }

    }
    public static boolean isRotation(String string1, String string2){
        return(string1.length()==string2.length()) && ((string1+string1).indexOf(string2)!=-1);
    }
}