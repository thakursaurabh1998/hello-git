import java.util.Scanner;

public class Q5{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String one = in.nextLine();
        String two = in.nextLine();
        System.out.println("Sentence \"" + one + "\" contains sentence \"" + two + "\": " + one.contains(two));
    }
}