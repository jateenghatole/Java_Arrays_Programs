import java.util.Arrays;

public class Reverse_The_Array {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverseArray(a)));
    }
    public static int [] reverseArray(int []a)
    {
        int [] b=new int[a.length];
        int index=0;
        for (int i=a.length-1;i>=0;i--)
        {
                b[index++]=a[i];
        }
        return b;
    }
}
