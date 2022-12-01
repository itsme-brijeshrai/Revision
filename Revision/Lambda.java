import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiConsumer;

public class Lambda {
    public static void main(String[] args) {
        // BiConsumer<Integer,Integer> customFunctionalInterface = (a,b) -> 
        // System.out.println(a+b);
        // customFunctionalInterface.accept(10,15);

        Functional<Integer,Integer> functional = (a,b) -> System.out.println(a+b);
        functional.accept(10, 15);
        
    }

}
