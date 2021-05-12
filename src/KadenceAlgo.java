import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorrectKadenceAlgo {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of the array");
        int n= Integer.parseInt(br.readLine());
        int[] a= new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i]= Integer.parseInt(br.readLine());
        }
        int currSum=0, maxSum=0;
        for (int i = 0; i < n; i++) {
            currSum=currSum+a[i];
            if(currSum>maxSum)
                maxSum=currSum;
            if(currSum<0)
                currSum=0;
        }
        System.out.println(maxSum);
    }
}
