public class LinearSearch {
    public static int findIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 7, 1, 9, 5};
        int target = 9;

        int index = findIndex(nums, target);
        System.out.println("Index: " + index);
    }
}