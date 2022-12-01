public class Multiplication {
    static class Multiply{
        static int x;
        static{
            x+=10;
    
        }
        Multiply(int x){
            x+= Multiply.x;
            System.out.println(x*this.x);
        }
    }
    public static void main(String[] args) {
        Multiply m = new Multiply(10);
    }
}
