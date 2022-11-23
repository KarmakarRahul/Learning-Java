import java.util.Scanner;

public class Fibonacci_I {
        public static void f(int n){
        int a=0,b=1,c=0;
        while(n>0){
            System.out.print(+a+" ");
            c=a+b;
            a=b;
            b=c;
            n--;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        f(n);
    }
}


