import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String , Long> phoneBook = new HashMap<String , Long>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            long phone = in.nextLong();
            // Write code here
            phoneBook.put(name , phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}