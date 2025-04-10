//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        s[0] = new Student(1, "Nguyễn Văn A", "abc@gmailcom", 16, 8.5F);
        s[1] = new Student(2, "Nguyễn Văn B", "abc2@gmailcom", 16, 7F);
        s[2] = new Student(3, "Nguyễn Văn c", "abc3@gmailcom", 16, 6F);
        s[3] = new Student(4, "Nguyễn Văn D", "abc4@gmailcom", 16, 4F);
        s[4] = new Student(5, "Nguyễn Văn E", "abc5@gmailcom", 16, 9.2F);

        System.out.printf("Tuổi trung bình của sinh viên là %.2f", averAge(s));
        System.out.printf("\nCó %d sinh viên đạt", countGrage(s));
        System.out.println("\nEmail của sinh viên Nguyễn Văm A là:");
        displayStudent(s);
    }

    public static float averAge(Student[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }
        return sum / arr.length;
    }

    public static int countGrage(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 5.0) {
                count++;
            }
        }
        return count;
    }

    public static void displayStudent(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals("Nguyễn Văn A")) {
                System.out.println(arr[i].getEmail());
            }
        }
    }
}