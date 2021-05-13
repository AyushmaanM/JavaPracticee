import java.util.Arrays;

public class RepNums {
    public static void main(String[] args) {
        int[] a= {1,2,34,5,1};
        int c=0;
        Arrays.sort(a);
        for (int i = 0; i < 4; i++) {
            if(a[i]==a[i+1]){
                c=a[i];
                break;
            }

        }
        System.out.println(c);
    }
}
