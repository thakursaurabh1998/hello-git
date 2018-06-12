import java.util.Scanner;

class Complex{
    double real;
    double imaginary;
    Complex(double x, double y){
        this.real = x;
        this.imaginary = y;
    }
    void printComplex(){
        System.out.print(this.real);
        if(this.imaginary>0)
            System.out.print("+");
        System.out.print(this.imaginary+"i");
    }    
}

public class Q2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double i = in.nextDouble();
        Complex number = new Complex(r,i);
        number.printComplex();
    }
}