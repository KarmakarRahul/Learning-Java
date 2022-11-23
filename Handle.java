//WAP to handle an inbuilt exception using try ,catch and finally

import java.util.Scanner;

public class Handle {
    public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     int[] a=new int[2];
     try {
         System.out.println("Enter the element of Array : ");
         for (int i = 0; i <= 2; i++) {
             System.out.print("value of " + (i + 1) + " is : ");
             a[i] = s.nextInt();
         }
     }
     catch(Exception e){
         System.out.println(e);
     }
     finally {
         System.out.println("Program ended");
     }
    }
}
