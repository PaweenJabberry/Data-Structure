package DoublyLinkedList;

public class DoublyLinkedList {
    private NodeBackwards first;
    private NodeBackwards last;
    private int count = 0;

    public int getCount() {
        return this.count;
    }

    // add first
    public void addFirst(NodeBackwards newNode) {

        if(null == first) {
            first = last = newNode;
        }
        newNode.setNextNode(first);
        first.setPreviousNode(newNode);
        first = newNode;
        count++;
    }

    // add last
    public void addLast(NodeBackwards newNode) {
        if(null == first) {
            first = last = newNode;
        }
        newNode.setPreviousNode(last);
        last.setNextNode(newNode);
        last = newNode;
        count++;
    }

    // delete first
    public void deleteFirst() {
        NodeBackwards currentNode = first.getNextNode();
        if(currentNode == null) {
            first = last = null;
        }
        else {
            first.setNextNode(null);
            first = currentNode;
            first.setPreviousNode(null);
        }
        count--;
    }

    // delete last
    public void deleteLast() {
        NodeBackwards currentNode = first;
        if(currentNode.getNextNode() == null) {
            first = last = null;
        }
        else {
            last = last.getPreviousNode();
        }

        count--;
    }

    // indexOf
    public int indexOf(int number) {
        if(number == first.getValue()) {
            return 0;
        }
        NodeBackwards currentNode = first.getNextNode();
        for(int i=1;i<count;i++) {
            if(number == currentNode.getValue()) {
                return i;
            }
            currentNode = currentNode.getNextNode();
        }
        return -1;
    }

    // valueOfIndex
    public int valueOfIndex(int index) {
        if(index == 0) {
            return first.getValue();
        } else if (index == count-1) {
            return last.getValue();
        }

        // Search from first
        if(index<(count-1)/2) {
            NodeBackwards currentNode = first;
            for(int i=0;i<index+1;i++) {
                if(i==index) {
                    return currentNode.getValue();
                }
                currentNode = currentNode.getNextNode();
            }
        } else {
            NodeBackwards currentNode = last;
            for(int i=count-1;i>index-1;i--) {
                if(i==index) {
                    return currentNode.getValue();
                }
                currentNode = currentNode.getPreviousNode();
            }
        }

        return -1;
    }

    // Delete At Index
    public boolean deleteAtIndex(int index) {
        if(index == 0) {
            first = first.getNextNode();
            first.setPreviousNode(null);
            count--;
            return true;
        } else if (index == count-1) {
            last = last.getPreviousNode();
            last.setNextNode(null);
            count--;
            return true;
        }

        // Search from first
        if(index<(count-1)/2) {
            NodeBackwards currentNode = first;
            for(int i=0;i<index+1;i++) {
                if(i==index) {
                    NodeBackwards temp = currentNode.getPreviousNode();
                    temp.setNextNode(currentNode.getNextNode());
                    temp = currentNode.getNextNode();
                    temp.setPreviousNode(currentNode.getPreviousNode());
                    count--;
                    return true;
                }
                currentNode = currentNode.getNextNode();
            }
        } else { // Search from last
            NodeBackwards currentNode = last;
            for(int i=count-1;i>index-1;i--) {
                if(i==index) {
                    NodeBackwards temp = currentNode.getPreviousNode();
                    temp.setNextNode(currentNode.getNextNode());
                    temp = currentNode.getNextNode();
                    temp.setPreviousNode(currentNode.getPreviousNode());
                    count--;
                    return true;
                }
                currentNode = currentNode.getPreviousNode();
            }
        }

        return false;
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
        NodeBackwards currentNode = first;
        for(int i=0;i<count;i++) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }

        return true;
    }
}
