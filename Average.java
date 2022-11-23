
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n;
        n=s.nextInt();
        int[] a =new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the mark of subject "+(i+1)+": ");
            a[i]=s.nextInt();
        }
        double avg;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=a[i];
        }
        avg=(double)sum/n;
        System.out.println("The average of the "+n+"subjects are : "+avg);
    }
}
