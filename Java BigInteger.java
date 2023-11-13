import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        
        BigInteger sum = a.add(b);
        BigInteger multiply = a.multiply(b);
        
        System.out.println(sum);
        System.out.println(multiply);

        // Scanner userInput = new Scanner(System.in);
        // BigInteger a;
        // BigInteger b;
        // BigInteger sum = BigInteger.valueOf(0);
        // BigInteger product = BigInteger.valueOf(0);
        
        // a = new BigInteger(userInput.nextLine());
        // b = new BigInteger(userInput.nextLine());
        
        // sum = sum.add(a);
        // sum = sum.add(b);
        // product = a.multiply(b);
        
        // System.out.println(sum);
        // System.out.println(product);
    }
}

