import java.util.Scanner;

public class Q3{
    public static boolean prime(int x){
        boolean flag = true;
        for(int i=2;i<x;i++){
            if(x%i==0){
                flag = false;
                break;
            }
        }
        if(flag && x!=1)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num + " is a prime number: " + prime(num));
    }
}