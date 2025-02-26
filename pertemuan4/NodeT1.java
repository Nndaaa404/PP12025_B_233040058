package pertemuan4;

public class NodeT1 {
    private Double data;
    private NodeT1 next;

    // inisialisasi Node
    public NodeT1 (Double data) {
        this.data = data;
    }

    // Setter & Getter (data)
    public void setData (Double data) {
        this.data = data;
    }

    public Double getData() {
        return data;
    }

    // Setter & Getter (Next)
    public void setNext (NodeT1 next) {
        this.next = next;
    }

    public NodeT1 getNext() {
        return next;
    }
}

