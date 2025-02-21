import java.util.Scanner;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                    }
                }
            }
        return new int[]{-1, -1};
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print size array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.print("Print " + size + " num(s): ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
            }
        System.out.print("Print sum two nums: ");
        int target = scanner.nextInt();
        int[] result = twoSum(nums, target);
        if (result[0] != -1) {
            System.out.println(result[0] + result[1]);
            }
            else {
            System.out.println("Not found");
            }
        }
    }
