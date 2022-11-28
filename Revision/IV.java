public class IV {
    public static void main(String[] args) {
      //we have to count words in a string.
      String string = "Quick Brown fox jumps over the laxy dog";
      int count = 1;
      for(int i=0;i<string.length()-1;i++){
        if((string.charAt(i)==' ') && (string.charAt(i+1)!=' ')){
            count++;
        }
      }
      System.out.println("Total number of words -> "+count);
    }
}
