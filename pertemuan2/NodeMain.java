package pertemuan2;

public class NodeMain {
    public static void main(String[] args) {
        
        // Membuat 2 buah node n1 & n2

        // ------- Node a -------
        // Node n1 = new Node(5);
        // Node n2 = new Node(7);
        // Node n3 = new Node(9);
        // Node n4 = new Node(8);

        // ------- Node b -------
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);
        Node n5 = new Node(9);

        // Membuat relasi Node n1 & n2

        // [ relasi node a ]
        // n1.setNext(n2);
        // n2.setNext(n3);
        // n3.setNext(n4);
        
        // [ relasi node b ]
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        // Menampilkan Node n1 & n2 dengan Pointer p
        Node p =n1;
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}
