
//WAP to handle an exception using throw keyword

import java.util.Scanner;

public class Handling3 {
    public static void age(int age){
        if(age<18){
            throw new ArithmeticException("Person is not eligible");
        }
        else{
            System.out.println("Person is eligible");
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        try {
            age(14);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
