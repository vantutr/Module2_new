import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Tú", 24, "Nghe An");
        Student student2 = new Student("Khánh", 22, "Hưng Yên");
        Student student3 = new Student("Long", 23, "Hà Nội");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("\n=================HasSet=================");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);

        for (Student student : studentSet) {
            System.out.println(student.toString());
        }

    }
}