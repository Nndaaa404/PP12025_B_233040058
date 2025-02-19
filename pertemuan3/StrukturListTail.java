package pertemuan3;

public class StrukturListTail {
    Node HEAD;
    
public void addTail (int data)
{
    Node posNode=null, curNode=null;

    Node newNode = new Node(data);
    if (isEmpty())
        {
            HEAD = newNode;
        }
        else
        {
            curNode = HEAD;
            while (curNode != null)
            {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
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
