public class Myprior {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        Thread t1 = new Thread(obj, "One");
        Thread t2 = new Thread(obj, "Two");
        t1.setPriority(2);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();

    }
}
