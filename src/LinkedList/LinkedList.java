package LinkedList;

public class LinkedList {
    private Node first;
    private Node last;
    private int count = 0;

    public int getCount() {
        return this.count;
    }

    public Node getFirst() {
        return this.first;
    }

    public Node getLast() {
        return this.last;
    }

    // add first
    public void addFirst(Node newNode) {

        if(null == first) {
            first = last = newNode;
        }
        newNode.setNextNode(first);
        first = newNode;
        count++;
    }
    // add last
    public void addLast(Node newNode) {
        if(null == first) {
            first = last = newNode;
        }
        last.setNextNode(newNode);
        last = newNode;
        count++;
    }
    // delete first
    public void deleteFirst() {
        Node currentNode = first.getNextNode();
        if(currentNode == null) {
            first = last = null;
        }
        else {
            first.setNextNode(null);
            first = currentNode;
        }
        count--;
    }

    // delete last
    public void deleteLast() {
        Node currentNode = first;
        if(currentNode.getNextNode() == null) {
            first = last = null;
        }
        else {
            for(int i=0;i<count;i++) {
                if(i==count-2) {
                    currentNode.setNextNode(null);
                    last = currentNode;
                    break;
                }
                currentNode = currentNode.getNextNode();
            }
        }

        count--;
    }
    // indexOf
    public int indexOf(int number) {
        if(number == first.getValue()) {
            return 0;
        }
        Node currentNode = first.getNextNode();
        for(int i=1;i<count;i++) {
            if(number == currentNode.getValue()) {
                return i;
            }
            currentNode = currentNode.getNextNode();
        }
        return -1;
    }

    // contains
    public boolean contains(int number) {
        return indexOf(number) != -1;
    }

    // show all nodes
    public boolean showAll() {
        if (first == null) {
            return false;
        }
        Node currentNode = first;
        for(int i=0;i<count;i++) {
            System.out.print(currentNode.getValue());
            if (i<count-1) {
                System.out.print("-->");
            }
            currentNode = currentNode.getNextNode();
        }
        System.out.println();

        return true;
    }
}
