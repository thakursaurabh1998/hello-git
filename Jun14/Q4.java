import java.util.Scanner;

public class Q4{
    static void alphaPattern(char end){
        String pattern = "";
        for(int i='a';i<=end;i++){
            pattern += (char)i;
            System.out.println(pattern);
        }
    }
    
    public static void main(String args[]){
        // Scanner in = new Scanner(System.in);
        // char end = (in.nextLine()).charAt(0);
        alphaPattern('e'); // Hardcoding 'e'
    }
}