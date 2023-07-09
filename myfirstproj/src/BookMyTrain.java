public class BookMyTrain{
    
    public static void main(String[] args) {
        TrainTickets tc = new TrainTickets(1);
        Thread t1 = new Thread(tc);
        Thread t2 = new Thread(tc);

        t1.setName("First Person");
        t2.setName("Second Person");
        t1.start();
        t2.start();
    }
}
