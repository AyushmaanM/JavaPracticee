import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class UandI {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b= {4,5,6,7,8,9};
        HashSet<Integer> h= new HashSet<Integer>();

        for (int i = 0; i < 6; i++) {
            h.add(a[i]);
        }
        for (int i = 0; i < 6; i++) {
            h.add(b[i]);
        }
    System.out.println(h);
    h.clear();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(a[i]==b[j])
                {
                    h.add(a[i]);
                }
            }

        }
        System.out.println(h);
    }
}
