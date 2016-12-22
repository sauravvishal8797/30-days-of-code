
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      scan.close();
      String a=" ";
      if(n % 2 == 1){
         a = "Weird";
      }
      else{
         // Complete the code
          if (n >= 2 && n <= 5)
              a = "Not Weird";
          else if (n >= 6 && n <= 20)
              a = "Weird";
          else if (n > 20)
              a = "Not Weird";
      }
      System.out.println(a);
   }
}