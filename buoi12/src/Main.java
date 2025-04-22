
public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Thêm nhiều sinh viên (mã số không theo thứ tự)
        manager.addStudent(1005, "Tú");
        manager.addStudent(1002, "Khánh");
        manager.addStudent(1008, "Hưng");
        manager.addStudent(1001, "Tuân");
        manager.addStudent(1010, "Hiếu");
        manager.addStudent(1003, "Tùng");
        manager.addStudent(1006, "Long");

        // Hiển thị danh sách sinh viên đã sắp xếp theo mã số
        System.out.println("\n--- DANH SÁCH SINH VIÊN ---");
        manager.displayStudents();

        // Tìm kiếm sinh viên tồn tại
        System.out.println("\n--- TÌM SINH VIÊN CÓ ID 1006 ---");
        manager.findStudent(1006);

        // Tìm kiếm sinh viên không tồn tại
        System.out.println("\n--- TÌM SINH VIÊN CÓ ID 9999 ---");
        manager.findStudent(9999);
    }
}
