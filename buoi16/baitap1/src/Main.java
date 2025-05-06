import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên file nguồn
        System.out.print("Nhập đường dẫn file nguồn: ");
        String sourcePath = scanner.nextLine();

        // Nhập tên file đích
        System.out.print("Nhập đường dẫn file đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra file nguồn có tồn tại không
        if (!sourceFile.exists()) {
            System.out.println("File nguồn không tồn tại!");
            return;
        }

        // Kiểm tra file đích đã tồn tại chưa
        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại! Không ghi đè.");
            return;
        }

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(targetFile)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytes = 0;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);  // Ghi đúng số byte vừa đọc
                totalBytes += bytesRead;          // Cộng dồn số byte đã sao chép
            }

            System.out.println("Sao chép thành công!");
            System.out.println("Tổng số ký tự (byte) đã sao chép: " + totalBytes);

        } catch (IOException e) {
            System.out.println("Có lỗi khi sao chép: " + e.getMessage());
        }
    }
}
