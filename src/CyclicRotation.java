import java.io.IOException;

public class CyclicRotation {
    public static void main(String[] args)throws IOException {
        int[] a={1,2,3,4,5,76,8};
        int m=a[0];

        for (int i = 0; i < 6; i++) {
            a[i]=a[i+1];
        }
        a[6]=m;

        for (int i = 0; i < 7; i++) {
            System.out.println(a[i]);

        }
    }
}
