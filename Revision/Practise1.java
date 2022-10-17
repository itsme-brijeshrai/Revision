public class Practise1 {
    void run(){
        System.out.println("Father is running");
    }
}
class Practise2 extends Practise1{
    void walk(){
        System.out.println("Child is walking");
    }
    public static void main(String[] args) {
        Practise1 p = new Practise2();
        Practise2 p2 = (Practise2)p;
        p2.walk();
        p2.run();
    }
}
