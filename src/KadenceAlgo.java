import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KadenceAlgo {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of the array");
        int n= Integer.parseInt(br.readLine());
        int[] a= new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i]= Integer.parseInt(br.readLine());
        }
        int sum=0, maxsum=0;
        for (int i = 0; i < n-1; i++) {
            sum=0;
            for (int j = i; j < n; j++) {
                sum=sum+a[j];
                if(sum>maxsum)
                {
                    maxsum=sum;
                }
            }
        }
        System.out.println(maxsum);
    }
}
