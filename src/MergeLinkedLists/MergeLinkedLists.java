package MergeLinkedLists;

import LinkedList.LinkedList;
import LinkedList.Node;
import DoublyLinkedList.DoublyLinkedList;
import DoublyLinkedList.NodeBackwards;

public class MergeLinkedLists {

    public static DoublyLinkedList mergeTwoWaysLinkedLists(DoublyLinkedList first, DoublyLinkedList second) {

        DoublyLinkedList newDoublyLinkedList = new DoublyLinkedList();
        NodeBackwards firstNode = first.getFirst();
        NodeBackwards secondNode = second.getFirst();

        while (first.getCount()+second.getCount()!=0) {
            if (firstNode.getValue()<secondNode.getValue() && first.getCount()!=0) {
                newDoublyLinkedList.addLast(new NodeBackwards(firstNode.getValue()));
                first.deleteFirst();
                if (first.getCount()!=0) {
                    firstNode = first.getFirst();
                }
            } else if (secondNode.getValue()<=firstNode.getValue() && second.getCount()!=0) {
                newDoublyLinkedList.addLast(new NodeBackwards(secondNode.getValue()));
                second.deleteFirst();
                if (second.getCount()!=0) {
                    secondNode = second.getFirst();
                }
            } else {
                if (first.getCount()!=0) {
                    newDoublyLinkedList.addLast(new NodeBackwards(firstNode.getValue()));
                    first.deleteFirst();
                    if (first.getCount()!=0) {
                        firstNode = first.getFirst();
                    }
                } else if (second.getCount()!=0) {
                    newDoublyLinkedList.addLast(new NodeBackwards(secondNode.getValue()));
                    second.deleteFirst();
                    if (second.getCount()!=0) {
                        secondNode = second.getFirst();
                    }
                }

            }
        }

        return newDoublyLinkedList;
    }


    public static LinkedList mergeOneWayLinkedLists(LinkedList first, LinkedList second) {
        
        LinkedList newLinkedList = new LinkedList();
        Node firstNode = first.getFirst();
        Node secondNode = second.getFirst();

        while (first.getCount()+second.getCount()!=0) {
            if (firstNode.getValue()<secondNode.getValue() && first.getCount()!=0) {
                newLinkedList.addLast(new Node(firstNode.getValue()));
                first.deleteFirst();
                if (first.getCount()!=0) {
                    firstNode = first.getFirst();
                }
            } else if (secondNode.getValue()<=firstNode.getValue() && second.getCount()!=0) {
                newLinkedList.addLast(new Node(secondNode.getValue()));
                second.deleteFirst();
                if (second.getCount()!=0) {
                    secondNode = second.getFirst();
                }
            } else {
                if (first.getCount()!=0) {
                    newLinkedList.addLast(new Node(firstNode.getValue()));
                    first.deleteFirst();
                    if (first.getCount()!=0) {
                        firstNode = first.getFirst();
                    }
                } else if (second.getCount()!=0) {
                    newLinkedList.addLast(new Node(secondNode.getValue()));
                    second.deleteFirst();
                    if (second.getCount()!=0) {
                        secondNode = second.getFirst();
                    }
                }

            }
        }

        return newLinkedList;
    }

    public static void main(String args[]) {

        System.out.println("----- LinkedList -----");

        LinkedList firstList = new LinkedList();
        LinkedList secondList = new LinkedList();

        firstList.addLast(new Node(10));
        firstList.addLast(new Node(50));
        secondList.addLast(new Node(20));
        secondList.addLast(new Node(20));
        secondList.addLast(new Node(30));
        secondList.addLast(new Node(40));
        firstList.showAll();
        secondList.showAll();

        LinkedList newList = mergeOneWayLinkedLists(firstList,secondList);
        newList.showAll();

        System.out.println("----- DoublyLinkedList -----");

        DoublyLinkedList firstDoublyLinkedList = new DoublyLinkedList();
        DoublyLinkedList secondDoublyLinkedList = new DoublyLinkedList();
        firstDoublyLinkedList.addFirst(new NodeBackwards(9));
        firstDoublyLinkedList.addFirst(new NodeBackwards(3));
        secondDoublyLinkedList.addFirst(new NodeBackwards(10));
        secondDoublyLinkedList.addFirst(new NodeBackwards(7));
        secondDoublyLinkedList.addFirst(new NodeBackwards(7));
        secondDoublyLinkedList.addFirst(new NodeBackwards(2));
        firstDoublyLinkedList.showAll();
        secondDoublyLinkedList.showAll();

        DoublyLinkedList newDoublyLinkedList = mergeTwoWaysLinkedLists(firstDoublyLinkedList,secondDoublyLinkedList);
        newDoublyLinkedList.showAll();

    }
}
