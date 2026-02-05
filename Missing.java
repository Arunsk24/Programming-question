import java.util.Scanner;
public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n-1];
        for(int i = 0; i <= arr.length-1;i++) {
            arr[i] = sc.nextInt();
        }

        int expectedsum = n * (n+1)/2;
        int actualsum = 0;

        for(int i = 0; i <= arr.length-1; i++) {
            actualsum += arr[i];
        }
        System.out.println( "Missing no: " + (expectedsum - actualsum));
    }
}
