import java.util.*;
public class FirstNonRepeatingL {

    public static char firstLetter(String str){
        // Array of 26 size to store the frequency of each character
        int arr[] = new int[26]; 
        Queue<Character> q = new LinkedList<>();  

        // loop
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch); 
            arr[ch - 'a'] ++;  //after adding letter in queue, we have to increase the count of that letter
        }

        while (!q.isEmpty() && arr[q.peek()] > 1){
            q.remove(); // removing char whose count is greater than 1
        }
        if(q.isEmpty()){
            return '@';        // no non repeating letter is present in the given string
        }else{
            return q.peek();
        }
        
    }

   

    public static void main(String[] args) {
        String str = "aabccb";
        System.out.println(firstLetter(str));
        // Time & space complexity is O(n) 
    }
}
