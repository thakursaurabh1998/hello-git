public class Q7{
    public static int reverse(int x){
        int rev=0;
        while(x!=0){
            rev = rev*10 + x%10;
            x/=10;
        }
        return rev;
    }
    public static void main(String args[]){
        System.out.print(reverse(1234));
    }
}