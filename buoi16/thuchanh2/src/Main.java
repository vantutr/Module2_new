import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập đường dẫn của file cần đọc: ");
        String inputFilePath = sc.nextLine();

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        int max = readAndWriteFile.findMaxValue(inputFilePath);

        System.out.println("Giá trị lớn nhất tìm được là: " + max);

        String outputFilePath = "result.txt"; // Tên file ghi ra
        readAndWriteFile.writeMaxValueToFile(outputFilePath, max);
    }
}
