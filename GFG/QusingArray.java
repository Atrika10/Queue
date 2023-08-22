public class QusingArray {
    class MyQueue {

        int front, rear;
        int arr[] = new int[100005];
    
        MyQueue()
        {
            front=0;
            rear=-1;
        }
        // TC & SC => O(1) in both function

        //Function to push an element x in a queue.
        void push(int x)  
        {
            //Check is my queue full?
                if (rear == arr.length-1) {   // I'm standing the last idx
                    return; // can't move further
                }
    
                // otherwise
                rear++;
                arr[rear] = x;
        } 
    
        //Function to pop an element from queue and return that element.
        int pop()
        {
             if (front > rear) {
                    front =0;
                    rear =-1;
                    return -1;
                }
                int val = arr[front];
                front++;
                return val;
        } 
    }
    public static void main(String[] args) {
        
    }
    
}
