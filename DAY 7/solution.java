import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;


public class Solution {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings =  new ArrayList();
       int a = scanner.nextInt();
       scanner.nextLine();
       for(int i=0;i<a;i++)
       {
           String b = scanner.nextLine(); 
           strings.add(b);
           String d = strings.get(i);
           char[] characters = d.toCharArray();
           for(int j=0;j<characters.length;j++)
           {
           if(j%2==0)
           {
               System.out.print(characters[j]);
           }
           }
           System.out.print(" ");
            for(int j=0;j<characters.length;j++)
           {
               if(j%2!=0)
               System.out.print(characters[j]);
           
           }
          
       System.out.println("");

           }
          scanner.close();

    }
}

