
import java.util.*;
import java.util.stream.Collectors;

class Student{
    int RollNo, Age;
    String Name;
    Student(int n, String s, int a){
        RollNo = n;
        Age = a;
        Name = s;
    }
    int getAge(){return Age;}
    int getRollno(){return RollNo;}
    String getName(){return Name;}
    
    @Override
    public String toString(){
        return "["+RollNo+" "+Name+" "+Age+"]\n";
    }
}

class StudentNameComparator implements Comparator<Student>{
    //public int compare(Object s1, Object s2){
    @Override
    public int compare(Student s1, Student s2){
        /*Student ss1 = (Student)s1;
        Student ss2 = (Student)s2;
        */return s1.getName().compareTo(s2.getName());
    }
}

public class StreamsComparator {

    public static void main(String args[]) {

        List<Student> studentList = Arrays.asList(new Student(10, "Ram D", 20),
                new Student(18, "Zeck C", 19),
                new Student(11, "Tom P", 23),
                new Student(9, "Ronny D", 19),
                new Student(13, "John P", 20));
        
        System.out.println("************ Sorting by name using traditional java without anonymous and java 8  ************ \n");
        System.out.println("Before sorting by name \n"+studentList);

        Collections.sort(studentList, new StudentNameComparator());
        System.out.println("After sorting by name traditional way \n"+studentList);

        System.out.println("\n************ Sorting age with anonymouys inner class  ************");
        System.out.println("Before sorting by age :"+studentList);
        Collections.sort(studentList, new Comparator<Student>() {
            @Override public int compare(Student student1, Student student2) {
                return student1.getAge()-(student2.getAge());
            }
        });
        System.out.println("After sorting by age :"+studentList);

        // comment Collections.sort() code above to check below code .
        System.out.println("\n************ Sorting roll number with java 8 comparator  ************ \n");
        System.out.println("Before sorting roll no with java 8 lambda "+studentList);

        // comparator to compare by roll no, name and age
        Comparator<Student> compareByRollNumber = (Student stu1, Student stu2) -> stu1.getRollno()-(stu2.getRollno());
        Comparator<Student> compareByAge = (Student stu1, Student stu2) -> stu1.getAge()-(stu2.getAge());
        Comparator<Student> compareByName = (Student stu1, Student stu2) -> stu1.getName().compareTo(stu2.getName());

        //APPROACH 1 using Collections.sort
        //Collections.sort(studentList, compareByRollNumber);
        //System.out.println("After sorting roll no with lambda"+studentList);

        //approach 2 ASC
        List<Student> sortedByRollNoUsingStreams = studentList.stream()
                .sorted(compareByRollNumber)
                .collect(Collectors.toList());
        System.out.println("After sorting roll no with lambda ASC order"+sortedByRollNoUsingStreams);

        //approach 2 descending
        List<Student> sortedByRollNoUsingStreamsDesc = studentList.stream()
                .sorted(compareByRollNumber.reversed())
                .collect(Collectors.toList());
        System.out.println("After sorting roll no with lambda DESC order"+sortedByRollNoUsingStreamsDesc);

        System.out.println("\n************ chain of sorts java 8 comparator  ************ ");
        System.out.println("Before comparing by age and then name"+studentList);
        List<Student> comparingByAgeThenName = studentList.stream()
                .sorted(compareByAge.thenComparing(compareByName))
                .collect(Collectors.toList());
        System.out.println("After comparing by age and then name"+comparingByAgeThenName);
    }
}