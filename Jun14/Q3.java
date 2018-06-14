import java.util.Scanner;

public class Q3{
    static String removeVowel(String str){
        String con = "";
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u')
                con += str.charAt(i);
        return con;
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(removeVowel(str));
    }
}