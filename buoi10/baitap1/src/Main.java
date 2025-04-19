//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        list.printList();

        System.out.println("\nelements 4 = " + list.get(4));
//        System.out.println("elements 5 = " + list.get(5));

        list.add(3, "X");
        list.printList();
        System.out.println("\nelements 3 = " + list.get(3));

        System.out.println("Danh sách có chứa B không? " + list.contains("B"));
        System.out.println("Danh sách có chứa Z không? " + list.contains("Z"));

        System.out.println("Vị trí của phần tử D: " + list.indexOf("D"));

        System.out.println("size = " + list.size());

        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");
        list.add("K");
        list.add("L");

        list.ensureCapacity(2);
        System.out.println("size = " + list.size());

        MyList<String> list1 = list.cloneList();
        System.out.print("Clone của danh sách: ");
        list1.printList();

        list.clear();
        list.printList();
    }
}