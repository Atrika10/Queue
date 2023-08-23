import java.util.*;
public class reversingFirstKelement {

    // Time complexity is O(n) & space complexity is O(k), where n= size of the given q & k = no of elements which i've to reverse

    public static void reverseKElement(Queue<Integer> q, int k){
        // step - 1 take a stack & push element till k=0;
        Stack<Integer> s = new Stack<>();
        while (k!=0) {
            s.push(q.remove());
            k--;
        }

        // step -2 store current size of q
        int size = q.size();
        System.out.println(size + " q size");

        // step -3 now pop element from stack & add it to q
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // step - 4 remove element from end until size=0 & add it in q
        for (int i = 0; i < size; i++) {
            q.add(q.remove());        // removing from first & adding in last
        }
        System.out.println(q);

    }

    public static void main(String args[]){
        //Q = [10, 20, 30, 40, 50, 60] ,k=4
        Queue<Integer> q  = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        reverseKElement(q, 4);
        
    }
    
}
