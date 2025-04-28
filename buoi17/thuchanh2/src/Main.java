import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student("MS01", "Trần Văn Tú", "Nghệ An"));
        students.add(new Student("MS02", "Ngô Gia Khánh", "Bắc Ninh"));
        students.add(new Student("MS03", "Phạm Quốc Khánh", "Hưng Yên"));
        students.add(new Student("MS01", "Đỗ Bá Tùng", "Nam Định"));
        writeDataToFile("C:\\Users\\ACER\\Documents\\CodeGym\\Module-2\\baitap\\buoi17\\thuchanh2\\students.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("C:\\Users\\ACER\\Documents\\CodeGym\\Module-2\\baitap\\buoi17\\thuchanh2\\students.txt");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }

    public static void writeDataToFile(String path, List<Student> students) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path) throws IOException {
        List<Student> students = new ArrayList<Student>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}