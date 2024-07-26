import java.lang.Math;

public class Train implements interfac {
    public int add(int a, int b, int c){
        a=8;
        b=65;
        c=a+b;
        System.out.println("addition="+c);
        return c;

    }
    public int subtract(int a, int b, int c){
        a=8;
        b=65;
        c=a-b;
        System.out.println("subtraction="+c);
        return c;
    }
    public int multiply(int a, int b, int c){
        a=8;
        b=65;
        c=a*b;
        System.out.println("multiply="+c);
        return c;
    }
    public float divide(int a, int b, int c){
        a=8;
        b=65;
        c=a/b;
        System.out.println("divide="+c);
        return c;
    }
    public double power(int a, int b){
        a=8;
        b=65;
        return Math.pow(a,b);
    }
    
    public static void main(String[] args) {
        Train calculator = new Train();
        int num1=12;
        int num2= 6;
        int num3=0;
        
         
        calculator.add(num1,num2,num3);
        calculator.subtract(num1,num2,num3);
        calculator.multiply(num1,num2,num3);
        calculator.divide(num1,num2,num3);
        calculator.power(num1,num2);
    }


    }  

