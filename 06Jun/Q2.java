public class Q2{
    public static boolean leap(int y){
        if(((y%4==0) && (y%100!=0)) || (y%400==0))
            return true;
        else
            return false;
    }

    public static void main(String args[]){
        System.out.print("2013 is leap: " + leap(2013));
        System.out.print("\n2000 is leap: " + leap(2000));
        System.out.print("\n2020 is leap: " + leap(2020));
        System.out.print("\n2012 is leap: " + leap(2012));
    }
}