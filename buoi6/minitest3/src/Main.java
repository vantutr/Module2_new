import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book[] book = new Book[6];
        book[0] = new ProgrammingBook();
        book[1] = new ProgrammingBook("MSV02", "Lập trình Python", 100, "Hoa Tâm", "Python", "ORM");
        book[2] = new ProgrammingBook("MSV03", "Lập trình Java nâng cao", 100, "Tú", "Java", "MVC");
        book[3] = new FictionBook("MSV04", "XYZ", 60, "Nguyen Van A", "Viễn tưởng 1");
        book[4] = new FictionBook("MSV05", "Đắc Nhân Tâm", 120, "Tran Van B", "Viễn tưởng 2");
        book[5] = new FictionBook("MSV06", "ABCD", 150, "Nguyen Thị C", "Viễn tưởng 1");

        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("========================Menu========================");
            System.out.println("1. Tính tổng tiền của 6 cuốn sách");
            System.out.println("2. Đếm số sách ProgrammingBook có language là \"Java\"");
            System.out.println("3. Đếm số sách Fiction có category là \"Viễn tưởng 1\"");
            System.out.println("4. Đếm số sách Fiction có giá <100");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Tổng  tiền 6 cuốn sách là: " + sumPrice(book) + ".000 VNĐ");
                    break;
                case 2:
                    System.out.println("Số sách ProgrammingBook có language là Java là: " + countBookLanguageJava(book));
                    break;
                case 3:
                    System.out.println("Số sách FictionBook có category là Viễn tưởng 1 là: " + countCategory(book));
                    break;
                case 4:
                    System.out.println("Số sách Fiction có giá <100 là: " + countFiction(book));
                    break;
                case 0:
                    System.out.println("Đã thoát");
            }
        }
    }

    public static int sumPrice(Book[] books) {
        int sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }
        return sum;
    }

    public static int countBookLanguageJava(Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                ProgrammingBook pBook = (ProgrammingBook) book;
                if (pBook.getLanguage().equals("Java")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countCategory(Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                FictionBook fBook = (FictionBook) book;
                if (fBook.getCategory().equals("Viễn tưởng 1")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countFiction(Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                FictionBook fBook = (FictionBook) book;
                if (fBook.getPrice() < 100) {
                    count++;
                }
            }
        }
        return count;
    }

}