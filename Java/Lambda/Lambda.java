package Java.Lambda;

public class Lambda {
    public static void main(String[] args) {
        printThing(()-> System.out.println("Meow"));
    }
    static void printThing(Printable thing){
        thing.print();
    }
}
