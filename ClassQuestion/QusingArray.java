public class QusingArray{
    static class Queue{

        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        // data will be added to last  TC = O(1)
        public static void add(int data){
            //Check is my queue full?
            if (rear == arr.length-1) {   // I'm standing the last idx
                return; // can't move further
            }

            // otherwise
            rear++;
            arr[rear] = data;
        }

        // data remove from front  TC = O(n)
        public static int remove(){ 
             // check if my q is empty
             if(rear == -1){
                 return -1;
             }
             // remove from front
             int front = arr[0];
             // copy next element in current idx
             for (int i = 0; i < rear; i++) {
                 arr[i] = arr[i+1];
             }
             // update the rear
             rear--;
             return front; 
        }

        // peek from front          TC = O(1)
        public static int peek(){
            // check if my q is empty
            if(rear == -1){
                return -1;
            }

            // remove from front
            return arr[0];
        }

    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        System.out.println(q.isEmpty());
        q.add(0);
        q.add(1);
        q.add(2);
        System.out.println(q.isEmpty());
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println(q.isEmpty());


    }
}