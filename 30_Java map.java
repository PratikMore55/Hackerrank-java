import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Map<String,Integer> name_ph = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            int phone=sc.nextInt();
            name_ph.put(name,phone);
            sc.nextLine();
        }
        while(sc.hasNext())
        {
            String s=sc.nextLine();
            System.out.println(name_ph.containsKey(s)?s+"="+name_ph.get(s):"Not found");
        }
    }
}
