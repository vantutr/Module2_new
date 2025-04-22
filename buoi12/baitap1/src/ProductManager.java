import java.util.*;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean checkIdExistence(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void editProduct(String id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                products.set(i, product);
                break;
            }
        }
    }

    public void deleteProduct(String id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                products.remove(i);
            }
        }
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void searchProductByName(String name) {
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                System.out.println("Sản phẩm " + name + " nằm ở vị trí thứ: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sản phẩm " + name + " không có trong danh sách");
        }
    }

    public void sortByPriceAscending() {
        Collections.sort(products);
    }

    public void sortByPriceDescending() {
        Collections.sort(products.reversed());
    }

}
