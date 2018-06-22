public class Q3 {
    public static <T> void printArr(T arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ((i == arr.length - 1) ? "" : ", "));
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        Integer A[] = { 123, 16, 3, 0, -25, 90, 3 };
        printArr(A);
        Character B[] = { 'h', 'g', 'o', 'p', 'a', 's', 'z' };
        printArr(B);
        Double C[] = { 2.34, 5.12, 0.12, 1.34 };
        printArr(C);
    }
}