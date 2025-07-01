import java.util.Scanner;

public class printXnNumberOfTimes {

    // Given 2 integers X and N, print the value of X on the screen N times. Move to
    // the next line after printing.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print: ");
        int X = sc.nextInt();
        System.out.println("Enter the number of times the number to be printed: ");
        int N = sc.nextInt();

        // implementing for loop.
        for (int i = 1; i <= N; i++) {
            System.out.print(X + " ");
        }
        System.out.println();
        sc.close();
    }

}
