//WAP to handle exception using nested try and multiple catch

import java.util.Scanner;

public class Handling2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            try {
                System.out.println("division by zero");
                int a = 55 / 0;
            } catch (Exception e) {
                System.out.println("can't divide by zero");
            }
            try {
                int[] a = new int[5];
                a[5] = 18;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" index out of range");
            }
//            System.out.println("");
            int a= s.nextInt();

        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
