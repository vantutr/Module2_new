import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> countries = readCsvFile("C:\\Users\\ACER\\Documents\\CodeGym\\Module-2\\baitap\\buoi16\\baitap2\\src\\country.csv");
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static List<Country> readCsvFile(String filePath) {
        List<Country> countries = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Xoá dấu ngoặc kép nếu có
                line = line.replace("\"", "");
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String code = data[1];
                String name = data[2];
                countries.add(new Country(id, code, name));
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
        return countries;
    }
}
