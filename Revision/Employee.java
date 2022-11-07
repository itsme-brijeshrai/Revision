import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
    Integer Id;
    String name;
    String designation;

    public Employee(Integer Id, String name, String designation){
        this.Id = Id;
        this.name = name;
        this.designation = designation;
    }


    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Ram", "SDE1"));
        list.add(new Employee(3, "Kalu", "Data ops"));
        list.add(new Employee(2, "Ranjan", "SDE1"));
        list.add(new Employee(5, "Ravi", "SDE3"));
        list.add(new Employee(4, "Shyam", "SDE2"));
        
        for(int i=0;i<list.size();i++){
            Employee emp = list.get(i);
            System.out.println(emp.Id+" "+emp.name+" "+emp.designation);
        }

    }
}
