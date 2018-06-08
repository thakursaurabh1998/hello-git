import java.util.Arrays;

public class Q6 {
	public static void insertionSort(int[] arr) {
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
	public static void main(String[] args ) {
        int A[] = {1,1,1,1,0,0,1,0};
        insertionSort(A);
		System.out.print(Arrays.toString(A));
	}
}