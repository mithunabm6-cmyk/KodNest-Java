
public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4};
        int val = 2;
        ```
    Solution solution = new Solution();

        int k = solution.removeElement(nums, val);

        System.out.println("New length: " + k);
        System.out.println("Array after removal: "
                + Arrays.toString(Arrays.copyOf(nums, k)));
    }
    ```

}
