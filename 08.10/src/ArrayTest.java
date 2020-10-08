import java.lang.reflect.Array;

public class ArrayTest {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3};
        for(int i = 0; i<a.length;i++){
            if(a[i]%2==0)
                System.out.println(a[i]*=i+1);
        }

    }
}
