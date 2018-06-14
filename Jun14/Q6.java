public class Q6{
    static int wordsNumber(String str){
        int count=0;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)==' ' || i==str.length()-1)
                count++;
        return count;
    }
    public static void main(String args[]){
        String str = "I am Saurabh Thakur. I am a web developer.";
        System.out.println(wordsNumber(str));
    }
}