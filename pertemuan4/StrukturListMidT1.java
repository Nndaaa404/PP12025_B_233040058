package pertemuan4;

public class StrukturListMidT1 {
    NodeT1 HEAD;

    // Menambah data di awal
    public void addHead(double data) {
        NodeT1 newNode = new NodeT1(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    private boolean isEmpty() {
        return (HEAD == null);
    }

    public void displayElement() {
        NodeT1 curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }

    // Menambah data di akhir
    public void addTail(double data) {
        NodeT1 posNode = null, curNode = null;

        NodeT1 newNode = new NodeT1(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    // Menambah data di tengah
    public void addMid(Double data, int position) {
        NodeT1 posNode = null, curNode = null;
        int i;

        NodeT1 newNode = new NodeT1(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            if (position == 1) {
                newNode.setNext(curNode);
                HEAD = newNode;
            } else {
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);

            }

        }
    }
}
