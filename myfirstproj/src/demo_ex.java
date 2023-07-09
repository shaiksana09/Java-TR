public class demo_ex {
    public static void main(String[] args) {
        try {
            System.out.println("open the file");
            int n = 2;
            System.out.println("The length of the argument " +n);
            int a  = 45/n;
            System.out.println("a: "+a);
            int b[] = new int[60];
            System.out.println(b.length);
            b[50] = 100;
        }

        catch(ArithmeticException | ArrayIndexOutOfBoundsException ae) {
            // System.out.println(ae);
            // System.out.println("Please pass the data while running this program");

            // instead of using the println statements we can use this
            ae.printStackTrace();
        }

        // catch(ArrayIndexOutOfBoundsException aie) {
        //     aie.printStackTrace();
        //     System.out.println("Please see that array index is within the range");
        // }

        finally {
            System.out.println("Close the file");
        }
    }
}
