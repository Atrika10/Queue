import java.util.*;
public class Deque {
    
    // stack using deque
     static class stack{
       static Deque<Integer> dq = new LinkedList<>();

        public static void push(int data){
            dq.addLast(data);
        }

        public static int pop(){
            if(!dq.isEmpty()){
                return dq.removeLast();
            }
            return -1; // no element
        }
        public static int peek(){
            if(!dq.isEmpty()){
                return dq.getLast();
            }
            return -1; // no element
        }
        public static boolean isEmpty(){
            return dq.isEmpty();
        }
     }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
