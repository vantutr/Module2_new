//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList("A");
        myLinkedList.addFirst("B");
        myLinkedList.addFirst("C");
        myLinkedList.addFirst("D");
        myLinkedList.addFirst("E");

        myLinkedList.add(2, "X");
        myLinkedList.printList();
        System.out.println();

        System.out.println(myLinkedList.get(2).getData());

        myLinkedList.addFirst("Y");
        myLinkedList.printList();
    }
}