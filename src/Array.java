import java.util.Scanner;
public class Array {

    static Scanner scn = new Scanner(System.in);
    static int n, ns;
    static String q;

    //SSA - Show Sorted Array

    public static void SSA(int[] a, int n){
        for (int i = 0; i < n; i++) {
            System.out.print("[" + a[i] + "]");
        }
    }

    public static void main(String[] args) {
        System.out.println("Insert amount of elements in array: ");
        n = scn.nextInt();
        int[] a = new int[n];
        System.out.println("Insert your array here: ");
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();

        }

        System.out.println("Your Array: ");
        Array.SSA(a, n);
        System.out.println(" ");

        Insertion v = new Insertion();
        MyMethod mm = new MyMethod();

        System.out.println("Your Array sorted by Insertion method:");
        a = v.InsertedArray(a);
        Array.SSA(a, n);

        System.out.println(" ");

        System.out.println("Your Array sorted by My Own method");
        a = mm.MyOwnArray(a);
        Array.SSA(a, n);


    }
}

