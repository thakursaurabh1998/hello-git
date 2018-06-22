import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student{
    Integer age;
    String name;
    Student(Integer age, String name){
        this.age = age;
        this.name = name;
    }
}

class CompareAge implements Comparator<Student>{
    public int compare(Student a, Student b){
        if(a.age>b.age && (a.name).equals(b.name)) return 1;
        if(a.age<b.age && (a.name).equals(b.name)) return -1;
        else return 0;
    }
}

class CompareName implements Comparator<Student>{
    public int compare(Student a, Student b){
        if((a.name).compareTo(b.name)>0) return 1;
        if((a.name).compareTo(b.name)<0) return -1;
        else return 0;
    }
}

public class Q4{
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(18, "Monica"));
        studentList.add(new Student(21, "Joey"));
        studentList.add(new Student(19, "Chandler"));
        studentList.add(new Student(20, "Phoebe"));
        CompareName studentCompareName = new CompareName();
        Collections.sort(studentList, studentCompareName);
        System.out.println("Sorted by name :");
        for(Student i:studentList)
            System.out.println(i.age + " " + i.name);
        CompareAge studentCompareAge = new CompareAge();
        Collections.sort(studentList, studentCompareAge);
        System.out.println("Sorted by age :");
        for(Student i:studentList)
            System.out.println(i.age + " " + i.name);
    }
}