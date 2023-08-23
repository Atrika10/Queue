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
            int idx = ch - 'a';
            arr[idx] += 1;  //after adding letter in queue, we have to increase the count of that letter
        }
        while (!q.isEmpty()){
            char ch = q.remove(); // remove element from front
            // check in that idx of arr array
            if(arr[ch -'a'] == 1) { // means this is my first non repeating letter
                return ch;
            }
        }
        // no non repeating letter is present in the given string
        return '1';
    }

    public static int firstChar(String str){
        // Array of 26 size to store the frequency of each character
        int arr[] = new int[26]; 
        Queue<Integer> q = new LinkedList<>();  

        // loop
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(i); 
            int idx = ch - 'a';
            arr[idx] += 1;  //after adding letter in queue, we have to increase the count of that letter
        }
        while (!q.isEmpty()){
            int idx = q.remove(); // remove element from front
            char ch = str.charAt(idx);
            // check in that idx of arr array
            if(arr[ch -'a'] == 1) { // means this is my first non repeating letter
                return idx;
            }
        }
        //  non repeating letter is available;
        return -1;
    }

    public static void main(String[] args) {
        String str = "aabccb";
        System.out.println(firstLetter(str));
        System.out.println(firstChar(str));
        // Time & space complexity is O(n) for both function
    }
}
