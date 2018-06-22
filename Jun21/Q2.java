import java.util.Arrays;

public class Q2  {
    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        T temp; 
        T window;
        for(int i=1;i<arr.length;i++){
            window = arr[i];
            for(int j=i-1;j>=0;j--){
                if(window.compareTo(arr[j])<0){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args ) {
        Integer A[] = {123,16,3,0,-25,90,3};
        insertionSort(A);
        Character B[] = {'h','g','o','p','a','s','z'};
        insertionSort(B);
        Double C[] = {2.34, 5.12, 0.12, 1.34};
        insertionSort(C);
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		System.out.println(Arrays.toString(C));
	}
}
