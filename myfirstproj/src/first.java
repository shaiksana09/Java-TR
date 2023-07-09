public class first {
    public static void main(String[] args) {
        int a = 10;
        try {
            //int n = 10/0;
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.println("Hey give this a value in float if it is not showing any decimal");
        }
        // err helps to print or display any error
        // System.err.println("Hey give this a value in float if it is not showing any decimal");
        // System.out.println(a);
    }
}