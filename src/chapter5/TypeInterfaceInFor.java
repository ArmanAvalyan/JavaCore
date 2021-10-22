package chapter5;

public class TypeInterfaceInFor {
    public static void main(String[] args) {
        System.out.print("Value of x: ");
        for (double x = 2.5; x < 100.0; x *= 2) {
            System.out.print(x + " ");
        }
        System.out.println();
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.print("Values in nums array: ");
        for (int v : nums) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
