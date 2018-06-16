import java.util.Scanner;

public class Q1{
    static String reverse(String str){
        int start=0, stop;
        String rev = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' || i==str.length()-1){
                if(i!=str.length()-1)
                    stop = i;
                else
                    stop = i+1;
                rev = str.substring(start,stop) + rev;
                start = i+1;
                if(i!=str.length()-1)
                    rev = " " + rev;
            }
        }
        return rev;
    }
    public static void main(String args[]){
        // Scanner in = new Scanner(System.in);
        // String str = in.nextLine();
        String str = "I am Saurabh";
        System.out.println(reverse(str));
    }
}