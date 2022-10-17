package Java.Thread;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 1 running");
        super.run();
    }
    public static void main(String[] args) {
        ThreadDemo tr1 = new ThreadDemo();
        tr1.start();

    }
}
