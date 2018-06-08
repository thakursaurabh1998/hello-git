public class Q6{
    public static boolean prime(int x){
        boolean flag = true;
        for(int i=2;i<x;i++){
            if(x%i==0){
                flag = false;
                break;
            }
        }
        if(flag && x!=1)
            return true;
        else
            return false;
    }

    public static void main(String args[]){
        System.out.print("13 is prime: " + prime(13));
        System.out.print("\n20 is prime: " + prime(20));
        System.out.print("\n1 is prime: " + prime(1));
    }
}