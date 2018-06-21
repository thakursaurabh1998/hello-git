import java.util.HashSet;

public class Q1{
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(7);
        set2.add(9);
        set2.add(7);
        set2.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(7);
        set1.add(9);
        set1.add(0);
        System.out.println("HashSet 1 : " + set1);
        System.out.println("HashSet 2 : " + set2);
        set1.retainAll(set2);
        System.out.println("Intersection of HashSet1 and HashSet2 : " + set1);
    }
}