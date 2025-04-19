public class Main {
    public static void main(String[] args) {
        PeopleChain chain = new PeopleChain();

        chain.addLast("Tú");
        chain.addLast("Khánh");
        chain.addLast("Hưng");
        chain.display();

        chain.addFirst("Tùng");
        chain.display();

        chain.removeFirst();
        chain.display();

        chain.removeLast();
        chain.display();

        System.out.println("Tìm 'Tú'? " + chain.contains("Tú"));
        System.out.println("Tìm 'Long'? " + chain.contains("Long"));
    }
}
