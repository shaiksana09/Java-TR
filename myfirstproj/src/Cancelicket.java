public class Cancelicket extends Thread{
    Object train, comp;
    public Cancelicket(Object train, Object comp) {
        this.train = train;
        this.comp = comp;
    }

    public void run() {
        synchronized(train) {
            System.out.println("Cancel Ticket locked on Comaprtment");
            try {
                Thread.sleep(200);
            } catch (InterruptedException ie) {}
            System.out.println("Cancel Ticket now waiting to lock on Train");
            synchronized(comp) {
                System.out.println("Cancel Ticket lock on Train");
            }
        }
    }
}
