public class Size {
    Node head;
    private int size;

    Size(){
        this.size = 0;
    }

    class Node {
        String data;
        Size.Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size ++;
        }
    }
    public void addFirst(String data){
        Size.Node newNode = new Size.Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Size.Node newNode = new Size.Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Size.Node currNode = head;
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
        size--;
        head = head.next;
    }

    //Delete Last
    public void  deleteLast(){
        if(head == null) {
            System.out.println("This list is empty");
            return;
        }
        size --;
        if (head.next == null){
            head = null;
            return;
        }

        Size.Node secondLast = head;
        Size.Node lastNode = head.next;
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
        Size.Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public int getSize(){
        return size;
    }
    public static void  main (String[] args){
        Size list = new Size();

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

       System.out.println(list.getSize());
       list.addFirst("Raja");
       System.out.println(list.getSize());
    }
}
