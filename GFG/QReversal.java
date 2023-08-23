import java.util.*;
public class QReversal {

    // Time & Space Complexity will be O(n), where n is the size of the given Queue
    public static Queue<Integer> reverseQ(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {         // pushing element in stack until my q is empty
            s.push(q.peek()) ;
            q.remove();
        }

        while (!s.isEmpty()) {          // from stack I'll get those element in reverse order while poping element
            q.add(s.pop());
        }
        return q;
    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseQ(q);
    }
}
