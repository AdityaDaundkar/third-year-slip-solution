import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a linked list containing names
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CPP");
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("PHP");

        // Display the contents of the list using an Iterator
        System.out.println("Contents of the List using an Iterator:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Display the contents of the list in reverse order using a ListIterator
        System.out.println("\nContents of the List in Reverse Order using a ListIterator:");
        ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
