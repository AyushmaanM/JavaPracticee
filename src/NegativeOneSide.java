import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NegativeOneSide
{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=Integer.parseInt(br.readLine());
        }
        int start=0, temp;
        for (int i = 0; i < n; i++) {
            if(a[i]<0){
                if(i!=start)
                {
                    temp=a[i];
                    a[i]=a[start];
                    a[start]=temp;

                }
                start++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        }
}
