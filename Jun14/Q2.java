public class Q2{
    static void substrings(String str){
        int n = str.length();
        for(int i=1;i<=n;i++)
            for(int j=0;j<n-i+1;j++)
                System.out.println(str.substring(j,j+i));
    }
    public static void main(String args[]){
        substrings("xyz");
    }
}