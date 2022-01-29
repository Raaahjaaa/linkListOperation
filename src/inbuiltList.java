import java.util.*;

//this code block is to know access pre defined java list creation and usage
public class inbuiltList {
    public static  void main ( String[] args ){
    LinkedList<String> list = new LinkedList<String>();
    // how give input in the link

    list.addFirst("is");
    list.addFirst("Raja");
    System.out.println(list);

    list.addFirst("Hey!");
    list.add("a");
    list.add("Dude.");
    System.out.println(list);

    // how to find size of list
        System.out.println(list.size());

    // If you want to perform a loop and print list

    for (int i=0; i<list.size(); i++){
        System.out.print(list.get(i)+" ");
    }
    System.out.print("null");

        // Delete First & Delete Last
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        // to remove specific index
        list.remove(3);
    }
}
