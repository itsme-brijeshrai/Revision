package Java.Thread;

public class ThreadDemo2 implements Runnable{
    public ThreadDemo2(Thread thread) {
    }
    @Override
    public void run() {
        System.out.println("Thread is running");
        
    }
    public static void main(String[] args) {
        Thread thread = new Thread();
        ThreadDemo2 thread2 = new ThreadDemo2(thread);
        thread2.run();
        
    }
}