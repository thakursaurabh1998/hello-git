public class Q1{
    public static void pattern(int x){
        for(int i=x;i>0;i--){
            for(int j=0;j<i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(5);
    }
}