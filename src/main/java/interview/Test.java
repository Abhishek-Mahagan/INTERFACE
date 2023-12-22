package interview;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Test
{
    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();
        students.add(new Student("Abhishek",20,List.of("Science","Math")));
        students.add(new Student("Ashish",33,List.of("DATA SCIENCE","ANALATICS")));
        students.add(new Student("Rahul",90,List.of("BIo","Math")));
        String Target_Course="Math";

        List<Student> filteredStudent=students.stream().filter(student -> student.age>21&&student.getCourse().
                contains(Target_Course)).collect(Collectors.toList());
        /*for (Student student:filteredStudent)
        {
            student.getStudent_Name

        }*/
        for (Student student:students)
        {
            System.out.println("Student_Name:"+student.getStudent_Name()
                    +",AGE:"+student.getAge()+",Course"+student.getCourse());
        }

        System.out.println("The Main output is of program");
        for (Student student:filteredStudent)
        {
            System.out.println("Student_Name:"+student.getStudent_Name()
                    +",AGE:"+student.getAge()+",Course"+student.getCourse());
        }
    }
}
