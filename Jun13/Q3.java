import java.util.Scanner;

public class Q3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);
        if(x>y)
            System.out.println(x + " is greater than " + y);
        else
            System.out.println(y + " is greater than " + x);
    }
}