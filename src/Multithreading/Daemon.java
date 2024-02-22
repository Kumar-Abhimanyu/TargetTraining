package Multithreading;

public class Daemon extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread is running");
        }
        else{
            System.out.println("User thread is running");
        }
    }

        public static void main(String[] args) {
        Daemon t1 = new Daemon();
        Daemon t2 = new Daemon();
        Daemon t3 = new Daemon();

        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
