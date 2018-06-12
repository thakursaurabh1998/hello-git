import java.util.Scanner;

class Rectangle{
    double length, breadth;
    Rectangle(double x, double y){
        this.length = x;
        this.breadth = y;
    }
    void area(){
        System.out.print("Area of rectangle = " + this.length*this.breadth);
    }    
}

public class Q1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double l = in.nextDouble();
        double b = in.nextDouble();
        Rectangle myRectangle = new Rectangle(l,b);
        myRectangle.area();
    }
}