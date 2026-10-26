
import java.util.Arrays;
import java.util.Scanner;

class sample {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        // int arr[] = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = scan.nextInt();
        // }
        // System.out.println(Arrays.toString(arr)); // another way to print array elements using arrays.tostring(arr) output: [1, 2, 3, 4, 5]

        // for (int num : arr) {
        //     System.out.print(num + " ");
        // } // for each loop 
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // } // to print elements in array
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = scan.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
