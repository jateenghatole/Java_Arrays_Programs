import java.util.Scanner;

public class Second_Largest_Element_In_An_Array {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter Array Size");
        int size=s.nextInt();
        int[] arr= new int[size];
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Enter Element at"+arr[i]);
            arr[i]=s.nextInt();
        }

//        int [] a={1,2,3,4,5,6,7,8,9};
        System.out.println();
        System.out.println("Second Largest Element In Array");
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int []ar){
        int firstLargest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;

        for (int i=0;i<ar.length;i++)
        {
            if (firstLargest<ar[i]){
                SecondLargest=firstLargest;
                firstLargest=ar[i];
            }
        }
        return SecondLargest;
    }
}
