public class MinJump {
    public static void main(String[] args) {
        int[] a={1,4,3,2,6,7};
        int l=0;
        int n=0,c=0;
        n=a[n];
        while(true){

            n=a[n];
            l=l+n;
            c++;
            if(l>6) {
                break;
            }
        }
        System.out.println(c);
    }
}
