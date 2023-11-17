 class Reverse_LinkedList {
    int value;
     Reverse_LinkedList next;

    public Reverse_LinkedList(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Reverse_LinkedList head;

    public LinkedList() {
        this.head = null;
    }

    public void addNode(int value) {
        Reverse_LinkedList newNode = new Reverse_LinkedList(value);
        if (head == null) {
            head = newNode;
        } else {
            Reverse_LinkedList current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void reverseList() {
        Reverse_LinkedList prev = null;
        Reverse_LinkedList current = head;
        Reverse_LinkedList next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void display() {
        Reverse_LinkedList current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.addNode(1);
        myList.addNode(2);
        myList.addNode(3);
        myList.addNode(4);

        System.out.println("Original List:");
        myList.display();

        myList.reverseList();

        System.out.println("Reversed List:");
        myList.display();
    }
}

