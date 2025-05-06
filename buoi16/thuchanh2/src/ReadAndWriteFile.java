import java.io.*;

public class ReadAndWriteFile {
    public int findMaxValue(String filePath) {
        int max = Integer.MIN_VALUE; // Khởi tạo max rất nhỏ để tìm giá trị lớn nhất
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException(filePath);
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line); // In ra dòng hiện tại (có thể không cần thiết)
                // Cắt dòng thành các số nhỏ hơn theo dấu cách
                String[] numbers = line.split("\\s+"); // "\\s+": nhiều dấu cách liên tiếp
                for (String numStr : numbers) {
                    if (!numStr.isEmpty()) { // Nếu chuỗi không rỗng
                        int number = Integer.parseInt(numStr);
                        if (number > max) {
                            max = number;
                        }
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }
        return max;
    }

    public void writeMaxValueToFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write("Giá trị lớn nhất là: " + max);
            writer.close();
            System.out.println("Đã ghi giá trị lớn nhất vào file " + filePath);
        } catch (IOException e) {
            System.err.println("Có lỗi khi ghi file!");
        }
    }
}
