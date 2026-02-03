import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        int arr[] = {12,45,85,32,45,89};
        Arrays.sort(arr);
        for(int a: arr) {
            System.out.print(a+", ");
        }
    }
}
