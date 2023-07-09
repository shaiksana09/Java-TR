import java.util.Scanner;

public class arrayuse {
    public static void main(String[] args) {
        // int a[] = {1, 2, 3, 4, 5};
        // System.out.println(a.length);

        // System.out.println(a[0]);
        // a[6] = 15;

        // int a[] = new int[10];
        // System.out.println(a.length);

        // a[0] = 12;
        // a[2] = 14;

        // for (int i =0; i<a.length; i++) {
        //     System.out.println(a[i]);
        // }
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i<size; i++) {
            System.out.println("Enter the value of "+i+"th index: ");
            arr[i]  = sc.nextInt();
        }
        System.out.println("The values of the array are: ");
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}
