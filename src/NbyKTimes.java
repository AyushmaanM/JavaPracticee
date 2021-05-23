import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class NbyKTimes {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k= Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int div = n/k;
        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        int c =1;
        for (int i = 0; i < n-1; i++) {
            if(a[i]==a[i+1]){
                c++;}
            if(c>=div)
            {
                System.out.println(a[i]);
                c=1;
            }
        }

    }
}
