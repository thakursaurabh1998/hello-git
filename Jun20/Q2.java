import java.util.HashMap;

public class Q2{
    public static void main(String[] args) {
        HashMap<String,Integer> myMap = new HashMap<>();
        myMap.put("Saurabh", 783);
        myMap.put("Hawking", 1000);
        myMap.put("Einstien", 1000);
        myMap.put("Saurabh", 785);
        System.out.println(myMap);
        System.out.println("Map value for \"Saurabh\" is : " + myMap.get("Saurabh"));
    }
}