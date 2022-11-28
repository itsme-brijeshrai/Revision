import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//list of employee {id,name}
//id should be even , name should start with "a";

public class Employees {
    Integer id;
    String name;

    public Employees(Integer id, String name){
        this.id=id;
        this.name=name;
    }
    
    @Override
    public String toString() {
        return "Employees [id=" + id + ", name=" + name + "]";
    }

    public static void main(String[] args) {
        List<Employees> list = new ArrayList<>();
        list.add(new Employees(1, "anmol"));
        list.add(new Employees(2, "arya"));
        list.add(new Employees(4, "anubhav"));

        List<Employees>l = list.stream().filter(i -> i.id%2==0).filter(n -> n.name.startsWith("a")).collect(Collectors.toList());
        System.out.println(l);
    }
}
