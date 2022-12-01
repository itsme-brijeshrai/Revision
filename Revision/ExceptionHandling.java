public class ExceptionHandling{
    public static void main(String[] args) {
        try{
            Integer a = null;
            Integer b = 0;
            Integer c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Error code 1");
        }catch (NullPointerException e){
            System.out.println("Error code 2");
        }catch (Exception e){
            System.out.println("error code 3");
        }
    }

}