package pertemuan4;

public class Node {
    private int data;
    private Node next;

    // inisialisasi Node
    public Node (int data) {
        this.data = data;
    }

    // Setter & Getter (data)
    public void setData (int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    // Setter & Getter (Next)
    public void setNext (Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}

