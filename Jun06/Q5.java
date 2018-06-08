import java.awt.SystemTray;

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
        int num = 10010;
        if(num==reverse(num))
            System.out.print("The number is palindrome");
        else
            System.out.print("The number is not palindrome");
    }
}