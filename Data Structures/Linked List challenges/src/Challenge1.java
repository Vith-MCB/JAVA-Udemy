/*
Creating a Linked List:

Challenge: Create a singly linked list with nodes that contain integer data.
Task: Implement the Node and LinkedList classes without errors.
 */
public class Challenge1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head;

        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node currentHead = head;
                while (currentHead.next != null) {
                    currentHead = currentHead.next;
                }
                currentHead.next = newNode;
            }
        }

        public void printList() {
            Node currentNode = head;
            while (currentNode != null){
                System.out.println("Current Data: "+currentNode.data);
                currentNode = currentNode.next;
            }
        }

        /* Challenge: Remove elements */
        public void removeElement(int target){
            //Making sure the head is not null
            if(head == null){
                return;
            }

            //Element is not in the list
            if(head.next == null){
                if(head.data != target){
                    System.out.println("The element is not in the list!");
                    return;
                }
                else{
                    head = head.next;
                    return;
                }
            }

            //The element is not the head
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

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(5);
        linkedList.insert(4);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);
        linkedList.printList();

        System.out.println("\nRemoving 3 from the list");
        linkedList.removeElement(3);
        linkedList.printList();
    }
}