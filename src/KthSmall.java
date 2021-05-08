import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KthSmall {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length");
        int len= Integer.parseInt(br.readLine());
        int arr[]=new int[len];
        System.out.println("Enter the Numbers");
        for (int i = 0; i < len; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Which smallest Number?");
        int k = Integer.parseInt(br.readLine());
        Arrays.stream(arr).sorted();
        System.out.println("The number you want is "+ arr[k-1]);

    }
}
