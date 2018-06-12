import java.util.Arrays;
import java.util.Scanner;

class Sorting{
    public void insertionSort(int[] arr) {
        int temp, window;
        for(int i=1;i<arr.length;i++){
            window = arr[i];
            for(int j=i-1;j>=0;j--){
                if(window<arr[j]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void swap(int[] arr){
        int n = arr.length;
        int temp;
        if(n%2!=0)
            n--;
        for(int i=0;i<n;i+=2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}

public class Q4{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        Sorting obj = new Sorting();
        obj.insertionSort(arr);
        obj.swap(arr);
        System.out.println(Arrays.toString(arr));
    }
}