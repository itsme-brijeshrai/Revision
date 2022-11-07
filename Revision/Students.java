import java.util.LinkedList;
import java.util.List;

public class Students {
    int rollNumber;
    String name;
    String course;
    int fees;

    public Students(int rollNumber, String name, String course, int fees){
        this.rollNumber=rollNumber;
        this.name=name;
        this.course=course;
        this.fees=fees;
    }

    public static void main(String[] args) {
        List<Students> list = new LinkedList<>();
        list.add(new Students(1, "Brijesh", "java developer", 300));
        list.add(new Students(2, "Chandani", "java developer", 200));
        list.add(new Students(3, "Dipak", "mern developer", 250));
        list.add(new Students(4, "Kunal", "dev ops developer", 500));
        list.add(new Students(5, "Anubhav", "mean developer", 300));


        for(int i=0;i<list.size();i++){
            Students students = list.get(i);
            if(students.course=="java developer"){
                System.out.println("roll no :-> "+students.rollNumber+", "+"name: "
                +students.name+", "+"course enrolled: "+students.course+", "+"fees: "+students.fees);
            }
        }
    }

    
}
