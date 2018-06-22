import java.util.Scanner;
import java.util.Date;

public class Q1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input date in dd/mm/yyyy format: ");
        String date = in.nextLine();
        String dateInArr[] = date.split("/");
        int year = Integer.parseInt(dateInArr[2]);
        int month = Integer.parseInt(dateInArr[1]);
        int day = Integer.parseInt(dateInArr[0]);
        Date humanDate = new Date(year-1900, month-1, day);
        System.out.println("Date in human readable form: " + humanDate);
    }
}