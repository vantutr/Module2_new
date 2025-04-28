import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Product> products = new ArrayList<>();
        products.add(new Product("MS101", "Iphone 11", 20000, "Apple", "Điện thoại chất lượng"));
        products.add(new Product("MS102", "Iphone 12", 25000, "Apple", "Điện thoại chất lượng"));
        products.add(new Product("MS103", "Samsung A12", 10000, "Samsung", "Điện thoại chất lượng"));
        products.add(new Product("MS104", "Oppo A7", 8000, "Oppo", "Điện thoại chất lượng"));
        String path = "C:\\Users\\ACER\\Documents\\CodeGym\\Module-2\\baitap\\buoi17\\baitap1\\products.txt";
        writeDataToFile(path, products);
        List<Product> productsFromFile = readDataFromFile(path);
        for (Product product : productsFromFile) {
            System.out.println(product);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id muốn tìm kiếm: ");
        String id = scanner.nextLine();
        Product foundProduct =searchProductById(path, id);
        if (foundProduct != null) {
            System.out.println("Đã tìm thấy sả phẩm có id " + id);
        } else {
            System.out.println("Không tìm thấy sả phẩm có id " + id);

        }

    }

    public static void writeDataToFile(String path, List<Product> products) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path) throws IOException {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public static Product searchProductById(String path , String id) throws IOException {
        List<Product> products = readDataFromFile(path);
        for (Product product : products) {
            if (product.getId().equalsIgnoreCase(id)) {
                return product;
            }
        }
        return null;
    }
}