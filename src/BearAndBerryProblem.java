import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LongestSubsequence{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i]= Integer.parseInt(br.readLine());
        }
        int sum = 0;
        int c = 0;
        for (int i = 0; i < l; i++) {
            if(c>(l-1))
                c=1;
            if(c==l-1)
                c=0;
            System.out.println(a[c]);
            sum=sum+a[c];
            if(sum>=100){
                sum-=a[c];
                break;
            }
            c+=2;
        }
        System.out.println(sum);
    }
}
