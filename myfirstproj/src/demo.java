public class demo {
    public static void main(String args[]) {
        try {
            System.out.println("Open files");
            int n = args.length;
            System.out.println("n = "+n);
            int a = 45/n;
            System.out.println("a = "+a);
            System.out.println("Hey this is running");
        }
        catch(ArithmeticException ae) {
           System.out.println(ae);
           System.out.println("Please pass data while runnimg this program"); 
        }
        finally {
            // close the file
            System.out.println("Close files");
        }
    }
}
