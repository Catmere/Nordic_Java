import java.util.function.DoubleBinaryOperator;

public class Test {

    public static void main(String args[]){
        if (false) {
            byte a = 1;
            byte b = 3;
            byte c = (byte) (a + b);
            System.out.println("c = " + c);

            int x = Integer.parseInt("123345");
            System.out.println(x);
            double y = Double.parseDouble("1111.22323");
            System.out.println(y);
            String result = Byte.toString(a);
            System.out.println(a);
            int superBinaryVar = 0b1111_1111_1111_1111_1111_1111_1111_1111;
            System.out.println("superBinaryVar = " + superBinaryVar);
            System.out.println("superBinaryVar = " + (superBinaryVar<<2));
            System.out.println("superBinaryVar = " + (superBinaryVar<<6));

        }

        int[] arr = new int[4];
        arr[4]=1000;
        System.out.println(arr[4]);
    }
}
