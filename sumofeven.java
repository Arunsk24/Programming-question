public class sumofeven {
    public static void main(String[] args) {
        int[] arr = {12,4,6,8,3,5,9,11,13};

        int evensum = 0;
        int oddsum = 0;

        for(int i = 0; i <= arr.length-1; i++) {
            if(arr[i]%2==0) {
                evensum += arr[i];
            } else {
                oddsum += arr[i];
            }
        }

        System.out.println("Even Sum: " + evensum);
        System.out.println("Odd Sum: " + oddsum);
    }
}
