package DoublyLinkedList;

public class NodeBackwards {
    private int value;
    private NodeBackwards nextNode;
    private NodeBackwards previousNode;

    public NodeBackwards(int value){
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setNextNode(NodeBackwards nextNode) {
        this.nextNode = nextNode;
    }

    public NodeBackwards getNextNode() {
        return nextNode;
    }

    public void setPreviousNode(NodeBackwards previousNode) {
        this.previousNode = previousNode;
    }

    public NodeBackwards getPreviousNode() {
        return previousNode;
    }
}
