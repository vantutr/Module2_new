import java.io.*;
import java.util.Scanner;

public class CopyBinaryFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập đường dẫn file nguồn
        System.out.print("Nhập đường dẫn file nguồn: ");
        String sourcePath = scanner.nextLine();

        // Nhập đường dẫn file đích
        System.out.print("Nhập đường dẫn file đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra file nguồn có tồn tại không
        if (!sourceFile.exists()) {
            System.out.println("File nguồn không tồn tại.");
            return;
        }

        // Kiểm tra nếu file đích đã tồn tại
        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại. Không ghi đè.");
            return;
        }

        // Gọi hàm copy file
        copyFile(sourceFile, targetFile);
    }

    public static void copyFile(File source, File target) {
        try (
                FileInputStream inputStream = new FileInputStream(source);
                FileOutputStream outputStream = new FileOutputStream(target)
        ) {
            byte[] buffer = new byte[1024]; // bộ đệm 1KB
            int bytesRead;
            int totalBytes = 0;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println("Sao chép thành công!");
            System.out.println("Tổng số byte đã sao chép: " + totalBytes);
        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép file: " + e.getMessage());
        }
    }
}
