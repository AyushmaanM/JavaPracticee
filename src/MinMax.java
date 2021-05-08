import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMax {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i =0;
        System.out.println("Enter Length of the Array");
        int l = Integer.parseInt(br.readLine());
        int a[]= new int[l];
        System.out.println("Enter the Numbers");
        for (i=0;i<l;i++)
        {
            a[i] = Integer.parseInt(br.readLine());
        }
        int min=a[0],max=a[0];
        for(i=0;i<a.length; i++) {
            if(min>a[i])
            {
                min = a[i];
            }
            if (max<a[i])
            {
                max = a[i];
            }
        }

        System.out.println(min+" "+max);
}
}