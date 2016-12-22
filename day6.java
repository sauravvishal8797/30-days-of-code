import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        String[] S = new String[l];
        for (int i = 0; i < l; i++)
            S[i] = scan.next();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < S[i].length(); j++) {
                if (j % 2 == 0)
                    System.out.print(S[i].charAt(j));
            }
            System.out.print(" ");
            for (int k = 0; k < S[i].length() ; k++) {
                if (k % 2 != 0)
                    System.out.print(S[i].charAt(k));
            }
            System.out.println();
        }
    }
}
        