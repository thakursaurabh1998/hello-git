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
}

class Q3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        Sorting obj = new Sorting();
        obj.insertionSort(arr);
        System.out.println("Second largest number in array: " + arr[n-2]);
    }
}