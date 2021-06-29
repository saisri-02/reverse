import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n,r,rev=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
            while(n!=0)
            {
           r=n%10;
           rev=(rev*10)+r;
           n=n/10;
            }
        System.out.println(""+rev);
       
    }
}