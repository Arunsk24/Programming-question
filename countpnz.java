import java.util.Scanner;
public class countpnz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elements");
        for(int i = 0; i <= arr.length-1; i++) {
            arr[i] = sc.nextInt();
        }

        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.println("Elements are: ");
        for(int i = 0; i <= arr.length-1; i++) {
            if(arr[i] > 0) {
                positive ++; 
            } else if(arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive : " + positive);
        System.out.println("negative : " + negative);
        System.out.println("zero : " + zero);
    }
}