import java.util.Scanner;

public class Cross{
    static void cross(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
               System.out.print((j==i||j==n-i-1)?'*':' ');
            System.out.print("\n");
        }
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        cross(n);
    }
}