package pertemuan3;

public class ListMainTail {
    public static void main(String[] args) {
        StrukturListTail list = new StrukturListTail();
        list.addTail (3);
        list.addTail (4);
        list.addTail (5);

        System.out.print("Elemen: ");
        list.displayElement();

        System.out.println();
        
        // TEST 1A
        StrukturListTail listA = new StrukturListTail();
        listA.addTail (3);
        listA.addTail (2);
        listA.addTail (1);
        
        System.out.print("Elemen: ");
        listA.displayElement();

        System.out.println();
        
        // TEST 1B
        StrukturListTail listB = new StrukturListTail();
        listB.addTail (1);
        listB.addTail (4);
        listB.addTail (5);
        listB.addTail (7);

        System.out.print("Elemen: ");
        listB.displayElement();
    }
}
