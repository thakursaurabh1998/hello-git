import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class KeyPress {
    static String keys[] = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static String[] combination(String n) {
        int num = Integer.parseInt(n.substring(0, 1));
        String alphas[] = new String[keys[num - 2].length()];
        for (int i = 0; i < keys[num - 2].length(); i++) {
            alphas[i] = "" + keys[num - 2].charAt(i);
        }
        if (n.length() <= 1)
            return alphas;
        int nextNum = Integer.parseInt(n.substring(0, 1));
        String catcher[] = new String[keys[nextNum - 2].length()];
        catcher = combination(n.substring(1));
        int lnt = alphas.length * catcher.length;
        String combinations[] = new String[lnt];
        int p = 0;
        for (int j = 0; j < catcher.length; j++)
            for (int k = 0; k < alphas.length; k++)
                combinations[p++] = alphas[k] + catcher[j];
        return combinations;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        String n = in.nextLine();
        System.out.println(Arrays.toString(combination(n)));
        in.close();
    }
}