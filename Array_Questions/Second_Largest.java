import java.util.Scanner;

public class Second_Largest {

    public static int Second_Largest_Element(int []arr){
        int n= arr.length;
        if (n < 2) {
            System.out.println(" The value Must be greater than 2 to get Second Largest Number:");

        }
        int largest= Integer.MIN_VALUE;
        int Second_largest= Integer.MIN_VALUE;
        for(int num:arr) {
            if (num > largest) {
                Second_largest = largest;
                largest = num;
            } else if (num > Second_largest && num != largest) {
                Second_largest = num;

            }
        }
        return (Second_largest == Integer.MIN_VALUE) ? -1 : Second_largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secondLargest = Second_Largest_Element(arr);
        if (secondLargest != -1) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}
