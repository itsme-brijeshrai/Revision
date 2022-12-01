import java.util.Objects;

@FunctionalInterface
public interface Functional <A,B>{
    
    void accept(A a, B b);
    default Functional<A, B> andThen(Functional<? super A, ? super B> after) {
        Objects.requireNonNull(after);

        return (l, r) -> {
            accept(l, r);
            after.accept(l, r);
        };
    }  
}
