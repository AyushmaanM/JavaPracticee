public class MinMax {
    public static void main(String[] args) {
        int a[] = {2,3,5,7,12,35,568,78,12,46,221};
        int min=a[0],max=a[0];
        for(int i=0;i<a.length; i++)
        {
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