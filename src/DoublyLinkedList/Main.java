package DoublyLinkedList;

public class Main {
    public static void main(String args[]) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addLast(new NodeBackwards(10));
        doublyLinkedList.addLast(new NodeBackwards(20));
        doublyLinkedList.addLast(new NodeBackwards(30));
        doublyLinkedList.addLast(new NodeBackwards(40));
        doublyLinkedList.addLast(new NodeBackwards(50));
        doublyLinkedList.addLast(new NodeBackwards(60));
        doublyLinkedList.addLast(new NodeBackwards(70));
        doublyLinkedList.addLast(new NodeBackwards(80));
        doublyLinkedList.addLast(new NodeBackwards(90));
        doublyLinkedList.addLast(new NodeBackwards(100));


        System.out.println(doublyLinkedList.deleteAtIndex(0));

        doublyLinkedList.showAll();

    }
}
