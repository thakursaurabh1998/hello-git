class Print{
    Print(){
        System.out.println("This is empty print function");
    }
    Print(int x){
        System.out.println("Print int: " + x);
    }
    Print(float x){
        System.out.println("Print float: " + x);
    }
}

public class Q3{
    public static void main(String args[]){
        Print sentence = new Print();
        sentence = new Print(16);
        sentence = new Print(17.8f);
    }
}