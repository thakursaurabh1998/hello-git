public class Q4{
    public static int largest(int x, int y, int z){
        int max = x;
        if(y>max) max=y;
        if(z>max) max=z;
        return max;
    }
    public static void main(String args[]){
        System.out.print("So the largest among 30, 12 and 83 is: " + largest(30, 12, 83));
    }
}