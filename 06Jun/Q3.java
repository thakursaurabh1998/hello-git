public class Q3{
    public static void pattern(int x){
        for(int i=0;i<x;i++){
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        pattern(4);
        // pattern(6);
    }
}