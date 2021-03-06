import org.w3c.dom.ls.LSOutput;

public class Addition {
        Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    // add - first(add at first Position), last ( add at last position)

        public void addFirst(String data){
        Node newNode = new Node(data);
            if(head == null){
            head = newNode;
            return;
        }
            newNode.next = head;
            head = newNode;
        }

        public void addLast(String data){
            Node newNode = new Node (data);
            if(head == null) {
                head = newNode;
                return;
            }

            Node currNode = head;
            while ( currNode.next != null){
               currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        // print

        public void printList(){
            if(head == null) {
               System.out.print("list is empty");
                return;
            }
            Node currNode = head;
            while (currNode != null){
                System.out.print(currNode.data + "->");
                currNode = currNode.next;
            }
            System.out.println("Null");
        }

    public static void  main (String[] args){
            Addition list = new Addition();

            list.addFirst("a");
            list.addFirst("is");

            list.printList();
            list.addLast("List");
            list.printList();

            list.addFirst("This");
            list.printList();

    }
}
