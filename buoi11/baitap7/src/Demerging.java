import java.io.*;
import java.util.*;

public class Demerging {
    public static void main(String[] args) {
        String inputFile = "input.txt"; // Đường dẫn file đầu vào
        String outputFile = "output.txt"; // Đường dẫn file đầu ra

        Queue<Person> femaleQueue = new LinkedList<>();
        Queue<Person> maleQueue = new LinkedList<>();

        // Đọc dữ liệu từ file và phân loại vào Queue
        readData(inputFile, femaleQueue, maleQueue);

        // Ghi dữ liệu ra file theo thứ tự: nữ trước, sau đó mới đến nam
        writeData(outputFile, femaleQueue, maleQueue);
    }

    // Đọc dữ liệu từ file
    public static void readData(String fileName, Queue<Person> femaleQueue, Queue<Person> maleQueue) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Dữ liệu cách nhau bằng dấu phẩy
                String name = data[0].trim();
                String gender = data[1].trim();
                String birthDate = data[2].trim();

                Person person = new Person(name, gender, birthDate);

                // Phân loại vào Queue
                if (gender.equalsIgnoreCase("female")) {
                    femaleQueue.add(person);
                } else if (gender.equalsIgnoreCase("male")) {
                    maleQueue.add(person);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ghi dữ liệu ra file
    public static void writeData(String fileName, Queue<Person> femaleQueue, Queue<Person> maleQueue) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            // Ghi dữ liệu nữ trước
            while (!femaleQueue.isEmpty()) {
                bw.write(femaleQueue.poll().toString());
                bw.newLine();
            }

            // Ghi dữ liệu nam sau
            while (!maleQueue.isEmpty()) {
                bw.write(maleQueue.poll().toString());
                bw.newLine();
            }

            System.out.println("Đã tổ chức lại dữ liệu thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}