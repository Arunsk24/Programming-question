

public class maxmin {
    public static void main(String[] args) {
        int[] arr = {12,54,78,99,11};

        int min = arr[0];
        int max = arr[0];


        for(int i = 0; i <= arr.length-1; i++) {
            if(arr[i] <= min) {
                min = arr[i];
            } else {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
