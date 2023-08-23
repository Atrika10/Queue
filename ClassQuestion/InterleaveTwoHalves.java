import java.util.*;
public class InterleaveTwoHalves {

    // Time & Space complexity will be O(n) , n= size of the string
    public static void interleaveTwoHalfs(String s){
        // step -1 fid mid
        int mid = s.length()/2;    // given: length of string is always even
        int lastHalfHead = mid-1;    // taking a pointer which is pointing to the prev idx of mid element

        // step 2 add element in queue from first half & last half
        Queue<Character> q = new LinkedList<>();  // Extra space => O(n)

        for (int i = 0; i < mid; i++) {           // running a loop => O(n) time
            lastHalfHead++;
            // int ch = s.charAt(i);
            q.add(s.charAt(i));

            q.add(s.charAt(lastHalfHead));
            
        }
        // step -3 print all element of queue
        while (!q.isEmpty()) {                      // running another loop => O(n) + O(n) => O(2n) => O(n) time
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "123456";
        interleaveTwoHalfs(s);
    }
    
}
