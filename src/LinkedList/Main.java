package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add nodes to list
        list.addLast(new Node(10));
        list.addLast(new Node(20));
        list.addLast(new Node(30));
        list.addLast(new Node(40));
        list.addLast(new Node(50));

        // Show all method process
        System.out.println("Count: "+list.getCount());
        System.out.println("----- Show all ------");
        list.showAll();
        System.out.println("Index Of 30: "+list.indexOf(30));
        System.out.println("Contains? "+list.contains(30));
        System.out.println("----- Delete last ------");
        list.deleteLast();
        list.showAll();
        System.out.println("----- Delete first ------");
        list.deleteFirst();
        list.showAll();
    }
}
