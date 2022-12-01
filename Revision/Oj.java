public class Oj {
    public static void main(String[] args) {
        int n = 4;
        int cost = 17;
        int[] costOfBook = {4,3,3,10};
        int[] noOfPages =  {7,4,10,3};

        for(int i=0;i<costOfBook.length;i++){
            for(int j=0;j<costOfBook.length;j++){
                if(costOfBook[i]<costOfBook[j]){
                    int temp = costOfBook[j];
                    costOfBook[j]=costOfBook[i];
                    costOfBook[i]=temp;
                    int temp1 = noOfPages[j];
                    noOfPages[j]=noOfPages[i];
                    noOfPages[i]=temp1;
                }
            }
        }
        // System.out.println(Arrays.toString(costOfBook));
        // System.out.println(Arrays.toString(noOfPages));
        int sumOfCost = 0;
        int sumOfPage = 0;
        for(int i=0;i<costOfBook.length;i++){
            sumOfCost+=costOfBook[i];
            if(sumOfCost<=cost){
                sumOfPage+=noOfPages[i];
            }
        }

        System.out.println(sumOfPage);
    }
}
