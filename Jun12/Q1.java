import java.util.Scanner;

class StaticClass{
    static int i;
    StaticClass(){
        System.out.println("StaticClass Constructor called");
    }
    public static void printFunction(){
        System.out.println("This is a function call");
    }
    static{
        i = 10;
        System.out.println("Static is called");
    }
}

public class Q1{
    public static void main(String args[]){
        System.out.println("Value of i: " + StaticClass.i);
        StaticClass.printFunction();
    }
}