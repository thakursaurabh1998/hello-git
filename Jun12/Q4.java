import java.util.Scanner;

public class Q4{
    static int subarray(int[] arr){
        int n = arr.length;
        int count=0, max=1;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i]){
                count++;
                if(count>max)
                    max=count;
            } else {
                count = 1;
            }
        }
        return max;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        // int arr[] = {12, 13, 1, 5, 4, 7, 8, 10, 10, 11};
        System.out.println("Length of longest increasing subarray: " + subarray(arr));
    }
}