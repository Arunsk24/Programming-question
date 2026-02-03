import java.util.TreeSet;
public class newsort {
    public static void main(String[] args) {
        int arr[] = {12,52,11,59,69,99,87,21,2,6};

        TreeSet<Integer> ts = new TreeSet<Integer>();
        for(int num: arr) {
            ts.add(num);
        }

        System.out.println(ts);
    }
}
