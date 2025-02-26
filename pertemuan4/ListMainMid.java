package pertemuan4;

public class ListMainMid {
    public static void main(String[] args) {
        // Output Latihan 3
        StrukturListMid list = new StrukturListMid();
        list.addTail (3);
        list.addTail (4);
        list.addMid (7,2);
        list.addMid (8,2);
        list.addHead (5);

        System.out.print("Elemen: ");
        list.displayElement();

        System.out.println();
        
        //  Output Tugas no 1
        StrukturListMidT1 list2 = new StrukturListMidT1();
        list2.addHead (2.1);
        list2.addTail (4.5);
        list2.addMid (3.4,2);

        System.out.print("Elemen: ");
        list2.displayElement();

        System.out.println();
        
        // Output Tugas no 2
        StrukturListMidT1 list3 = new StrukturListMidT1();
        list3.addHead (3.4);
        list3.addTail (4.5);
        list3.addTail (5.5);
        list3.addMid (2.1,2);
        list3.addMid (1.1,3);

        System.out.print("Elemen: ");
        list3.displayElement();

        System.out.println();
    }
}
