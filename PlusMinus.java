/*
Given an array of integers, calculate which fraction of the elements are positive, negative, and zeroes, respectively. Print the decimal value of each fraction.

Input Format

The first line, N, is the size of the array. 
The second line contains N space-separated integers describing the array of numbers (A1,A2,A3,⋯,AN).

Output Format

Print each value on its own line with the fraction of positive numbers first, negative numbers second, and zeroes third.

Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667
Explanation

There are 3 positive numbers, 2 negative numbers, and 1 zero in the array. 
The fraction of the positive numbers, negative numbers and zeroes are 36=0.500000, 26=0.333333 and 16=0.166667, respectively.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to 10−4 are acceptable.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        double pos = 0;
        double neg = 0; 
        double zero = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                pos += 1;
            }
            if(arr[i] < 0){
                neg += 1;
            }
            if(arr[i] == 0){
                zero += 1;
            }
        }
        
        
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zero/n);

    }
}