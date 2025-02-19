package pertemuan3;

public class ListMainHead {
    public static void main(String[] args) {
        // TEST 2
        StrukturListHead list = new StrukturListHead();
        list.addHead (5);
        list.addHead (4);
        list.addHead (3);
        
        System.out.print("Elemen: ");
        list.displayElement();

        System.out.println();
        
        // TEST 3A
        StrukturListHead listA = new StrukturListHead();
        listA.addHead (1);
        listA.addHead (2);
        listA.addHead (3);
        
        System.out.print("Elemen: ");
        listA.displayElement();
        
        System.out.println();

        // TEST 3B
        StrukturListHead listB = new StrukturListHead();
        listB.addHead (7);
        listB.addHead (5);
        listB.addHead (4);
        listB.addHead (1);

        System.out.print("Elemen: ");
        listB.displayElement();
    }
}
