import java.util.Scanner;

public class Fibonacci_II {

    public static int fun(int n){
       if(n<=1) return n;
       return fun(n-1) + fun(n-2);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        for(int i=0; i<n; i++) {
            int ans = fun(i);
            System.out.print(ans+" ");
        }
    }
}
