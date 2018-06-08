import java.util.Scanner;

public class Q7{
    public static boolean search(int[] arr, int l, int u, int x){
        int mid;
        if(u>0){
            mid = (l+u)/2;
            if(arr[mid]==x)
                return true;
            else if(arr[mid]<x)
                return search(arr,mid+1,u,x);
            else if(arr[mid]>x)
                return search(arr,l,mid-1,x);
        }
        return false;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] A = {1,4,6,7,8,9,10};
        System.out.println(search(A,0,A.length-1,num));
    }
}