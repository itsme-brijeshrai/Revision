package Java;
//it is static method and it gives compile time error.
// multiple methods can have the same name with different parameters.
// we can get it by 2 methods (i) -> by changing the number of arguments
                        //    (ii)-> by changing the data type of the arguments.
public class methodOverLoading {
    public static void main(String[] args) {
        findMyCat("tom", "vikas");
        findMyCat(20, 10);
    }
    public static void findMyCat(String catName, String Owner){
        System.out.println("ah got you my pussy cat " + " meoww");
    }
    public static void findMyCat(int x, int y){
        if(x==y){
            System.out.println("Here is the location of my cat");
        }else{
            System.out.println("need to fit gps collor on my cat");
        }
        
    }
}
