package Java;
// used to initialize objects
// must have the same name of the class
// does not have a return type
// Everytime a new object is created using new keyword, the default constructor is called.
public class Constructor {
    public static void main(String[] args) {
        Constructor cs = new Constructor();
        System.out.println(cs.x);
    }   
    int x;
    public Constructor(){
        
    }
}
// Q->  How many types of constructors are used in java.
// (i) no arguments constructor
// (ii) Paramaterized constructor
// (iii) Default constructor (created by the compiler when we do not call any constructor in the program)