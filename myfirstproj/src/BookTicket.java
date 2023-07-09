public class BookTicket extends Thread{  
   
    Object train, comp;
    public BookTicket(Object train, Object comp) {
        this.train = train;
        this.comp = comp;
    }
    public void run() {
        synchronized(train) {
            System.out.println("Book Ticket locked on Train");
            try {
                Thread.sleep(150);
            }
            catch (InterruptedException ie) {
            }
            System.out.println("BookTicket now waiting to lock on Compartment...");
        }
        synchronized(comp) {
            System.out.println("Boook Ticket Locked on Compartment");
        }
    }
}
