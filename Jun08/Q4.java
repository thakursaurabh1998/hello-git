import java.util.Scanner;

public class Q4{
    public static int digitsNumber(int x){
        int count=0;
        while(x!=0){
            count++;
            x/=10;
        }
        return count;
    }
    public static boolean armstrong(int x){
        int n = digitsNumber(x);
        int num = x;
        int p,temp;
        int total=0;
        while(num!=0){
            temp=1;
            p = num%10;
            for(int i=0;i<n;i++){
                temp*=p;
            }
            total+=temp;
            num/=10;
        }
        if(total==x)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num + " is an Armstrong number: " + armstrong(num));
    }
}