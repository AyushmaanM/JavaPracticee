public class RepNums {
    public static void main(String[] args) {
        int[] a= {1,2,34,5,3};
        int c=0;
        p:
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j <5 ; j++) {
                if(a[i]==a[j]){
                    c=a[i];
                    break p;
                }
            }
        }
        if(c>0)
        System.out.println(c);
        else
            System.out.println("No Common Nubers");
    }
}
