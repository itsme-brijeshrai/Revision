class A {
    protected void print(String s){
        System.out.println(s+" Technology");
    }
    static void print(Object s){
        System.out.println(s+" Technologies");
    }

}
class B extends A{
    protected void print(String s){
        System.out.println(s+" Technology Pvt Ltd");
    }

    static void print(Object s){
        System.out.println(s+" Technologies Pvt Ltd");
    }
}
public class Inheritance{
    public static void main(String[] args) {
        A a = new B();
        A.print(new StringBuilder("Nimesa"));
    }
}

  
