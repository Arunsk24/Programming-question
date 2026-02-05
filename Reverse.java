import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int arr2[] = new int[arr1.length];

        int j = arr1.length-1;

        for(int i = 0; i <= arr2.length-1; i++) {
            arr2[j] = arr1[i];
            j--;
        }

        System.out.println(Arrays.toString(arr2));
    }
}

