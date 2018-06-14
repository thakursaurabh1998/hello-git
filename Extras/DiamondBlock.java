import java.util.Scanner;

public class DiamondBlock{
    static void diamond(int n){
        int p=n/2,q;
        for(int i=0;i<n-1;i++){
            q = (i>=p)?(n-2-i):(i);
            for(int j=0;j<n;j++)
               System.out.print((j>=(p-q) && j<=(p+q-1))?' ':'*');
            System.out.print("\n");
        }
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        diamond(n);
    }
}