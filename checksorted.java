
public class checksorted {
    public static void main(String[] args) {
        int arr[] = {12,54,68,74,99};
        boolean issorted = true;

        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                issorted =  false;
            } 
        }
        System.out.println(issorted);
    }
}
