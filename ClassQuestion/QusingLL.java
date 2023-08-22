public class QusingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class Queue {
        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty() { // Tc => O(1)
            return head == null;
        }

        // add function
        public static void add(int data) { // Tc => O(1)
            // step -1 create a newNode
            Node newNode = new Node(data);

            // first time add
            if (head == null) {
                head = tail = newNode;
                return;
            }
            // For normal add, we have to add in last
            tail.next = newNode; // step -2 linking step
            tail = newNode; // step -3 update the tail node
        }

        // remove from front
        public static int remove(){ // Tc => O(1)
            // check , is my queue is empty ?
            if (head == null) {
                return -1;
            }
            // corner case, if I've only one element in queue
            if (head.next == null) {
                int val = head.data;
                head = tail =null;  // reinitialize head & tail with null
                return val;
            }
            // For normal remove process, we have to remove from front
            int val = head.data;
            head = head.next;
            return val;
        }

        public static int peek(){ // Tc => O(1)
             // check , is my queue is empty ?
            if (head == null) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        q.add(0);
        q.add(1);
        q.add(12);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println(q.isEmpty());

    }
}
