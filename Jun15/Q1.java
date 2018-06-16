import java.io.*;
import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            File file = new File("sample.txt");
            file.createNewFile();
            FileOutputStream w = new FileOutputStream(file);
            FileInputStream input = new FileInputStream(file);
            System.out.println("Enter file path of 4 files: ");
            String outString="";
            for(int i=0;i<4;i++){
                String str=in.nextLine();
                outString += str + "\n";
            }
            for(int i=0;i<outString.length();i++)
                w.write(outString.charAt(i));
            int i;
            while((i=input.read())!=-1)
                System.out.print((char)i);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
