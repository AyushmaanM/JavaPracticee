import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashSet;
import java.util.Iterator;

public class CommonInThree {
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int[] ArrA ={1,5,10,120,40,80};
        int[] ArrB= {6,7,20,80,100};
        int[] ArrC= {3,4,15,20,30,70,80,120};
        HashSet<Integer> AHash= new HashSet<Integer>();
        HashSet<Integer> BHash= new HashSet<Integer>();
        HashSet<Integer> CHash= new HashSet<Integer>();

        for (int i = 0; i < 6; i++) {
            AHash.add(ArrA[i]);
        }
        for (int i = 0; i < 5; i++) {
            BHash.add(ArrB[i]);
        }
        for (int i = 0; i < 8; i++) {
            CHash.add(ArrC[i]);
        }

        Iterator<Integer> itr=AHash.iterator();
        int temp;

        while(itr.hasNext()){
            temp= itr.next();
        if(BHash.contains(temp) && CHash.contains(temp))
            System.out.println(temp);
        }
    }
}
