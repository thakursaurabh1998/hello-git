import java.util.Scanner;

public class Q5{
    public static int reverse(int x){
        int rev=0;
        while(x!=0){
            rev = rev*10 + x%10;
            x/=10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print(reverse(num));
    }
}