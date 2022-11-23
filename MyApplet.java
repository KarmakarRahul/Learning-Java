import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



class MyApplet{
    public static void main(String[] args) {
        Frame f = new Frame("My Calculator");

        Label l1 = new Label("First Number");
        Label l2 = new Label("Second Number");
        Label l3 = new Label();

        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);

        Button b1 = new Button("Add");
        Button b2 = new Button("Sub");
        Button b3 = new Button("multiply");
        Button b4 = new Button("divide");

        f.setLayout(null);
        l1.setBounds(20,40,100,20);
        l2.setBounds(20,80,100,20);
        t1.setBounds(140,40,100,20);
        t2.setBounds(140,80,100,20);
        b1.setBounds(20,160,50,20);
        b2.setBounds(80,160,50,20);
        b3.setBounds(140,160,50,20);
        b4.setBounds(200,160,50,20);
        l3.setBounds(80,200,150,30);


        f.add(l1);
        f.add(t1);
        f.add(l2);

        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(l3);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b,sum;
                a=Integer.parseInt(t1.getText());
                b=Integer.parseInt(t2.getText());
                sum=a+b;
                l3.setText("Result : "+sum);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b,sum;
                a=Integer.parseInt(t1.getText());
                b=Integer.parseInt(t2.getText());
                sum=a-b;
                l3.setText("Result : "+sum);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b,sum;
                a=Integer.parseInt(t1.getText());
                b=Integer.parseInt(t2.getText());
                sum=a*b;
                l3.setText("Result : "+sum);
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a,b,sum;
                a=Double.parseDouble(t1.getText());
                b=Double.parseDouble(t2.getText());
                sum=a/b;
                l3.setText("Result : "+sum);
            }
        });




        f.setSize(300,300);
        f.setVisible(true);
    }
}