import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // List, ArrayList, and LinkedList

        // Create a List using ArrayList (dynamic array)
        List<Integer> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        // Create a List using LinkedList (doubly-linked list)

        /*
        A linked list is a data structure in computer science used for organizing and storing a collection of elements,
        where each element (node) in the list contains a value and a reference (or link) to the next element in the sequence.
        Linked lists are one of the fundamental data structures in computer science and come in various forms, with the most
        common types being singly linked lists and doubly linked lists.

        Here are some key points to understand about linked lists:

        Nodes: The basic building blocks of a linked list are nodes. Each node contains two parts:

        Data (or value): This is the information or content the node holds, such as an integer, string, or any other data type.
        Reference (or link): This is a pointer or reference to the next node in the sequence (for singly linked lists)
        or both the next and the previous nodes (for doubly linked lists).

        Head: The first node in the list is referred to as the head. It serves as the entry point for accessing the list.

        Tail: The last node in the list is known as the tail. In a singly linked list, the tail's reference points to null.
         In a doubly linked list, the tail has references to both the previous and next nodes.

        Singly Linked List: In a singly linked list, each node has a reference to the next node. Traversing a singly
        linked list can only be done in one direction, from the head to the tail.

        Doubly Linked List: In a doubly linked list, each node has references to both the next and the previous nodes.
        This allows for bidirectional traversal, making it easier to navigate the list in both directions.

        Advantages:

        Dynamic Size: Linked lists can dynamically grow or shrink, unlike arrays with fixed sizes.

        Efficient Inserts and Deletes: It's generally efficient to insert or delete elements in a linked list as
        you only need to update a few references.

        Disadvantages:

        Random Access: Accessing elements at a specific position in the list can be slower compared to arrays.
        Extra Memory Overhead: Linked lists require additional memory for storing the references.


        singly linked list:
        Head
         ↓
        [Data] -> [Data] -> [Data] -> [Data]
                ↑
               Tail


        doubly linked list:
        Head
         ↓
        [Data] <-> [Data] <-> [Data] <-> [Data]
                 ↑
                Tail

         */

        List<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Iterating through Lists

        // Iterating through ArrayList using Iterator
        System.out.println("ArrayList Elements:");
        Iterator<Integer> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            int num = arrayListIterator.next();
            System.out.println(num);
        }

        // Iterating through LinkedList using for-each loop
        System.out.println("\nLinkedList Elements:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Operations on Lists

        // Adding elements to the ArrayList at a specific index
        arrayList.add(1, 4); // Insert 4 at index 1

        // Removing an element from the LinkedList
        linkedList.remove("Banana");

        System.out.println("\nUpdated ArrayList:");
        for (int num : arrayList) {
            System.out.println(num);
        }

        System.out.println("\nUpdated LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Autoboxing and Unboxing
        /*
        Autoboxing is a feature in Java that allows automatic conversion between primitive data types and their
        corresponding wrapper classes. In simpler terms, it's the process of converting a primitive data type
        into an object (wrapper class) of the corresponding type, and vice versa, without the need for explicit code.


        Primitive Data Types: In Java, there are primitive data types like int, double, boolean, etc. These are not
        objects and don't have methods or attributes like objects.

        Wrapper Classes: For each primitive data type, there is a corresponding wrapper class. For example, int has
        Integer, double has Double, and boolean has Boolean.

        Automatic Conversion: With autoboxing, Java automatically converts a primitive data type into its corresponding
         wrapper class when needed. For example, if you assign an int to an Integer object, the int is automatically
         converted into an Integer.

        Benefit: Autoboxing simplifies code and makes it more readable. It allows you to work with primitive types
        and objects interchangeably, without explicitly converting between them.

         */

        // Autoboxing: Converting primitive int to Integer
        Integer x = 42;

        // Unboxing: Converting Integer back to int
        int y = x;

        System.out.println("\nAutoboxing and Unboxing:");
        System.out.println("Autoboxing: " + x);
        System.out.println("Unboxing: " + y);
    }
}