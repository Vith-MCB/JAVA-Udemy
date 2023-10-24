/*
Intermediate Linked List Challenges:

Deleting a Node:

Challenge: Implement a method to delete a node with a given value from a linked list.
Task: Write a function to remove a node with the specified value.
Reversing a Linked List:

Challenge: Reverse a singly linked list.
Task: Create a method that reverses the order of nodes in the list.
 */

public class Challenge2 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head;

        public void insert(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            } else {
                Node currentNode = head;
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = newNode;
            }
        }

        public void printList(){
            Node currentNode = head;
            while(currentNode != null){
                System.out.println("Current node data: "+currentNode.data);
                currentNode = currentNode.next;
            }
            return;
        }

        public void removeElement(int target){
            if (head == null) {
                // The list is empty, nothing to remove.
                return;
            }

            if (head.data == target) {
                // If the target is at the head, simply move the head to the next node.
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null) {
                if (current.next.data == target) {
                    // Found the target in the next node, so skip that node.
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
        }

        public void reverseList() {
            Node prev = null;
            Node current = head;
            Node next;

            while (current != null) {
                next = current.next; // Save the next node.
                current.next = prev; // Reverse the pointer of the current node.
                prev = current; // Move 'prev' to the current node.
                current = next; // Move 'current' to the next node.
            }

            // Update the head to the last node (which is the new first node).
            head = prev;
        }

    }

    public static void main(String[] args) {
        Challenge2.LinkedList linkedList = new Challenge2.LinkedList();
        linkedList.insert(5);
        linkedList.insert(4);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);
        linkedList.printList();


        System.out.println("\nReverse the linked list:");
        linkedList.reverseList();
        linkedList.printList();
    }
}
