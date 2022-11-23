
//WAP in java to implement concept of user defined exception for banking system

import java.util.Scanner;

class MinimumAccountBal extends Exception{
    String mess;

    public MinimumAccountBal(String mess) {
        this.mess=mess;
    }

    public String toString(){
        return mess;
    }
}

public class Exception_banking {

    static double curr=100;

      public static void main(String[] args)  {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the amount to withdraw ");
        int n= s.nextInt();
        try{
            if(curr < n){
               throw new MinimumAccountBal("Insufficient fund " + curr);
            }
            else{
                System.out.println("proceed");
            }
        }
        catch (MinimumAccountBal m){
            System.out.println(m);
        }

    }
}
