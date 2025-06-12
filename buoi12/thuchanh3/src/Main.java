import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Tú", 24, "Nghệ An");
        Student student1 = new Student("Khánh", 22, "Hưng Yên");
        Student student2 = new Student("Long", 23, "Hải Dương");
        Student student3 = new Student("Tùng", 28, "Nam Định");
        Student student4 = new Student("Khánh", 26, "Bắc Ninh");

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        Collections.sort(studentList);

        for (Student s: studentList) {
            System.out.println(s.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList, ageComparator);
        System.out.println("So sánh theo tuổi: ");
        for (Student s: studentList) {
            System.out.println(s.toString());
        }
    }
}