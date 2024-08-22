package Array;

public class findtwomiss {
    public int[] findTwoElement(int[] arr, int n) {
        int[] result = new int[2];

        // Find the duplicate number
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                result[0] = Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index];
            }
        }

        // Find the missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1:
        // int[] arr1 = {2, 2};
        findtwomiss sol = new findtwomiss();
        // int[] result1 = sol.findTwoElement(arr1, 2);
        // System.out.println("Duplicate number: " + result1[0] + ", Missing number: " + result1[1]);

        // Example 2:
        int[] arr2 = {1, 3, 3};
        int[] result2 = sol.findTwoElement(arr2, 3);
        System.out.println("Duplicate number: " + result2[0] + ", Missing number: " + result2[1]);
    }
}
