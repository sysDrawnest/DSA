public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert nodes
        list.insertAtPosition(10, 0); // Insert 10 at position 0
        list.insertAtPosition(20, 1); // Insert 20 at position 1
        list.insertAtPosition(30, 2); // Insert 30 at position 2
        list.insertAtPosition(15, 1); // Insert 15 at position 1

        System.out.println("Linked List after inserting nodes:");
        list.display(); // Should print: 10 -> 15 -> 20 -> 30 -> null

        // Delete a node
        list.deleteAtPosition(2); // Delete node at position 2
        System.out.println("Linked List after deleting node at position 2:");
        list.display(); // Should print: 10 -> 15 -> 30 -> null
    }
}
