import java.util.List;

public class Deletion {
    Node head;
    class Node {
        String data;
        Deletion.Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        Deletion.Node newNode = new Deletion.Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Deletion.Node newNode = new Deletion.Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Deletion.Node currNode = head;
        while ( currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    // Delete First
    public void deleteFirst(){
        if (head == null){
            System.out.println("This is empty");
            return;
        }
        head = head.next;
    }

    //Delete Last
    public void  deleteLast(){
        if(head == null) {
            System.out.println("This list is empty");
            return;
        }

        if (head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;

        }
            secondLast.next = null;

    }

    //Print Last

    public void printList(){
        if(head == null) {
            System.out.print("list is empty");
            return;
        }
        Deletion.Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void  main (String[] args){
        Deletion list = new Deletion();

        list.addFirst("a");
        list.addFirst("is");

        list.printList();
        list.addLast("List");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }
}
