import java.io.*;

public class Q1 {
    public static void copyFiles() {
        try {
            FileInputStream fileFrom = new FileInputStream("abc.txt");
            BufferedInputStream from = new BufferedInputStream(fileFrom);
            FileOutputStream fileTo = new FileOutputStream("xyz.txt");
            BufferedOutputStream to = new BufferedOutputStream(fileTo);
            byte a[] = new byte[from.available()];
            from.read(a);
            to.write(a);
            to.flush();
            from.close();
            to.close();
            fileTo.close();
            fileFrom.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        copyFiles();
        System.out.println("File copied");
    }
}