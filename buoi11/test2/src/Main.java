//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BookStack<String> books = new BookStack<>();

        books.push("Toán");
        books.push("Lý");
        books.push("Hóa");

        books.printStack();

        System.out.println("Peek: " + books.peek());
        System.out.println("Pop: " + books.pop());
        System.out.println("Peek after pop: " + books.peek());
        System.out.println("Is empty? " + books.isEmpty());
        System.out.println("Size: " + books.size());
        System.out.println("Search 'Toán': " + books.search("Toán"));
    }
}