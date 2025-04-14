public class FictionBook extends Book {
    private String category = "Viễn Tưởng";

    public FictionBook() {
    }

    public FictionBook(String bookCode, String name, int price, String author, String Category) {
        super(bookCode, name, price, author);
        this.category = Category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        category = category;
    }

    @Override
    public int getPrice() {
        return super.getPrice() * 93 / 100;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Category='" + category + '\'' +
                '}';
    }
}
