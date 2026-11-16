import java.util.Scanner;
class THIRD{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int thirdlargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                thirdlargest = largest;
                largest = arr[i];
            }
             else if (arr[i] > thirdlargest && arr[i] != largest) {
                thirdlargest = arr[i];
            }
        }
    }
}