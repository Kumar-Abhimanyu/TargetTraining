package Multithreading;

public class ThreadsDemo {
    public static void main(String[] args) {
        RThread rThread = new RThread();
        MyThread dbT = new MyThread("dbThread",10);
        dbT.start();
        MyThread netT = new MyThread("netThread", 100);
        netT.start();

        for(int i=1;i<5;i++){
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            System.out.println(i*10);
            System.out.println(Thread.currentThread().getName()+"-"+i*1000);
        }

    }
}