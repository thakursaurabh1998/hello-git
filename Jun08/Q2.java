import java.util.Scanner;

public class Q2{
    public static void even(int x){
        for(int i=0;i<=x;i+=2){
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        even(num);
    }
}