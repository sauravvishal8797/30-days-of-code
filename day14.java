import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
  	public int maximumDifference;
  	 Difference(int[] array){
        this.elements = array;
        }
         public void computeDifference(){
        int N = elements.length;
        
        int max = elements[0];
        for(int i = 1; i < N; i++){
            if(elements[i] > max){
                max = elements[i];
            }
        }
        maximumDifference = 0;
        for(int i = 0; i < N; i++){
            if(max - elements[i] > maximumDifference){
                maximumDifference = max - elements[i];
            }
        }
    }
    
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}