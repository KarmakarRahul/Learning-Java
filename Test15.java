import java.util.Scanner;
class Test{
    int r;
    public void insert(int x){
        r=x;
    }
    public void print(){
        System.out.println(3.13*r*r);
    }
}

public class Test15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the radius : ");
        int r=s.nextInt();
        Test t=new Test();
        t.insert(r);
        t.print();
    }
}
