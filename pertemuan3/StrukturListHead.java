package pertemuan3;

public class StrukturListHead {
    Node HEAD;
    
public void addHead (int data)
{
    Node newNode = new Node(data);
    if (isEmpty())
        {
            HEAD = newNode;
        }
        else
        {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    private boolean isEmpty() {
        return (HEAD == null);
    }

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }
}
