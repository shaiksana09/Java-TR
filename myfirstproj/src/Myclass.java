public class Myclass extends Thread{
    int count = 0;
    public void run() {
        for(int i=1; i <= 1000; i++) {
            count++;
        }
        System.out.println("Compelete Thread: "+Thread.currentThread().getName());
        System.out.println("Its Priority: "+Thread.currentThread().getPriority());
    }
    
}
