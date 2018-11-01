package week7.task1;


import java.lang.ArithmeticException;

public class ExpressionTest {
    public static void main(String[] argvs) {
        Expression a1= new Numeral(10);
        Expression a2=new Numeral(2);
        Expression a3= new Numeral(1);
        Expression a4=new Numeral(3);
        Expression b1= new Square(a1);
        Expression b2=new Subtraction(b1, a3);
        Expression b3=new Multiplication(a2,a4);
        Expression b4=new Addition(b3,b2);
        Expression c= new Square(b4);
        System.out.println(c.tostring());


        Expression a9=new Numeral(0);
        Expression c1= new Division(c,a9);
        System.out.println(c1.tostring());


    }
}