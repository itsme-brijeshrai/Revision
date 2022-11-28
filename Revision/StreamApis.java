import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.xml.sax.HandlerBase;

public class StreamApis {
    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();
        students.add(new Student(1984,"Vikas","Java", 3000));
        students.add(new Student(3425,"Venkat","Mern", 4500));
        students.add(new Student(926,"Shubham","Data Science", 3100));
        students.add(new Student(527,"Ankush","Python", 2550));
        students.add(new Student(228,"Chandani","Docker", 10000));
        students.add(new Student(139,"Muskan","AWS", 6700));
        students.add(new Student(1342,"Brijesh","Excel", 3900));
        students.add(new Student(345,"Anubhav","C++", 5999));

        System.out.println(students);
        List<Student>filterById=students.stream().filter(i->i.getId()%2==0).collect(Collectors.toList());
        System.out.println(filterById);

        List<Student> filterByName=students.stream()
        .filter(i->i.getName().endsWith("h"))
        .collect(Collectors.toList());
        System.out.println(filterByName);

        List<Student>mapbyFee=students.stream().map(i->{
            if(i.getFee()<5000){
                i.setFee(i.getFee()+500);
            }
            return i;
        }).collect(Collectors.toList());
        System.out.println(mapbyFee);

        List<Student>sortByName=students.stream()
        .sorted((i1,i2)->i1.getName().compareTo(i2.getName()))
        .collect(Collectors.toList());

        System.out.println(sortByName);

        List<Student>sortById=students.stream().sorted((i1,i2)->i1.getId()-i2.getId())
        .collect(Collectors.toList());
        System.out.println(sortById);

        Map<Integer,String>mapByName=new HashMap<>();
        List<Student>list=students.stream().map(i->{
            mapByName.put(i.getId(),i.getName());
            return i;
        }).collect(Collectors.toList());
        System.out.println(mapByName);

        Long count=students.stream().filter(i->i.getFee()>5000).count();
        System.out.println(count);

        Student max=students.stream().max((i1,i2)->i1.getFee()-i2.getFee()).get();
        System.out.println(max);

        List<Student>range=students.stream()
        .filter(i->i.getFee()>3000 && i.getFee()<7000)
        .collect(Collectors.toList());
        System.out.println(range);
    }
}

class Student{
    private Integer id;
    private String name;
    private String course;
    private Integer fee;
    public Student(Integer id, String name, String course, Integer fee) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public Integer getFee() {
        return fee;
    }
    public void setFee(Integer fee) {
        this.fee = fee;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", course=" + course + ", fee=" + fee + "]\n";
    }

    
}
