
public class TrainTickets implements Runnable {
    int available = 1;
    int wanted;

    public TrainTickets(int i) {
        wanted = i;
    }

    public void run() {
        synchronized(this){
            System.out.println("Avaialable Berths: "+available);
            if(available >= wanted) {
                String name = Thread.currentThread().getName();
                System.out.println(wanted + " Berths reserved for "+name);
                try {
                    Thread.sleep(1500);
                    available = available-wanted;
                    //System.out.println(available);
                } 
                catch (InterruptedException ie){
                }
            }
            else 
                System.out.println("Sorry no Berths");
        }

    }
}

