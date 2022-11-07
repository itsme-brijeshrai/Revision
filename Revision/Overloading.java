public class Overloading {
    public static void msg(String s){
        System.out.println("This is parent"+s);
    }
    public static void msg(Integer x){
        System.out.println("This is child"+x);
    }
    public static void main(String[] args) {
        msg(23);
        msg("smart shankar");
        
    }
}
