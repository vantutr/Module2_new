//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BookStack myStack = new BookStack();

        myStack.push("Toán");
        myStack.push("Lý");
        myStack.push("Hóa");

        myStack.printAllStack();

        System.out.println("Vị trí của 'Hóa': " + myStack.search("Hóa"));
        System.out.println("Vị trí của 'Toán': " + myStack.search("Toán"));
        System.out.println("Vị trí của 'Văn': " + myStack.search("Văn"));
        myStack.peek();
        myStack.pop();
        myStack.pop();
        myStack.peek();
        myStack.pop();
        myStack.pop();

        myStack.isEmpty();
    }
}
