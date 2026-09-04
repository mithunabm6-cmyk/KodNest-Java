
class Program7 {

    int count = 0;

    void count(int arr[], int key) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
         System.out.println(key ": " + count);
    }
}

public class Main {

    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 30, 40, 40, 30};
        Freq fs = new Freq();
    }

}
