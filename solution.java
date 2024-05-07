import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
         //counting smaller
        /*Mocha is given yet another task. In the task, mocha is provided with a sequence of n numbers.

In the sequence for every number, we have to find the count of elements that are strictly smaller than it and generate a sequence from it.

Your task is to help mocha in building the sequence.*/
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++){
          b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
          int count =0;
          for(int j=0;j<a;j++){
            if(b[i]>b[j]) count++;
          }
          System.out.print(count+" ");
        }
    }
}
