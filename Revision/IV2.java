public class IV2 {
    public static void main(String[] args) {
        String string = "brijeshrai9820@gmail.com";
        StringBuilder sb = new StringBuilder(string);
        for(int i=0;i<string.length()-1;i++){
        if(i%2==1){
            sb.setCharAt(i, '*');
            }
        }
        System.out.println(sb);
    }
}
