class LinkedList {
    private Node head; // Head of the linked list
    private int size;  // To track the size of the linked list

    // Constructor to initialize the list
    public LinkedList() {
        head = null;
        size = 0;
    }

    // Method to insert a node at a specific position
    public void insertAtPosition(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(value);

        if (index == 0) {
            // Insert at the beginning
            newNode.next = head;
            head = newNode;
        } else {
            // Traverse the list to find the position
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }

            // Insert the new node
            newNode.next = current.next;
            current.next = newNode;
        }

        size++; // Increment the size of the list
    }

    // Method to delete a node at a specific position
    public void deleteAtPosition(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            // Delete the first node
            head = head.next;
        } else {
            // Traverse the list to find the node before the position
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }

            // Remove the node by skipping it
            current.next = current.next.next;
        }

        size--; // Decrement the size of the list
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
