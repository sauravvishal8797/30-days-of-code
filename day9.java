import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static long factorial(int N){
            if(N == 1){
                return 1;
            }
            else{
                return(N * factorial(N - 1));
            }
            }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long f = factorial(N);
        System.out.println(f);
        
        }
        
    }
