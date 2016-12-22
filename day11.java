import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int sum = arr[i][i] + arr[i][i+1] + arr[i][i+2] + arr[i+1][i+1] + arr[i+2][i] + arr[i+2][i+1] + arr[i+2][i+2];
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}

