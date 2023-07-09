public class Deadlock {
    public static void main(String[] args) {
        Object train = new Object();
        Object comp = new Object();

        BookTicket obj1 = new BookTicket(train, comp);
        Cancelicket obj2 = new Cancelicket(train, comp);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
