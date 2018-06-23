class Task implements Runnable{
    int i=1;
    synchronized public void run(){
        while(i<=1000){
            System.out.println(i + " " + Thread.currentThread().getName());
            i++;
        }
    }
}

public class Q1{
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        Task newTask = new Task();
        Thread t1 = new Thread(newTask);
        Thread t2 = new Thread(newTask);
        t1.start();
        t2.start();
    }
}