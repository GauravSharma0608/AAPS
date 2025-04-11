import java.util.Scanner;

public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of Array : ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " Elements :");
        int[] arr = new int[n];
        for(int i =0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Value :");
        int val = sc.nextInt();
    }
}
