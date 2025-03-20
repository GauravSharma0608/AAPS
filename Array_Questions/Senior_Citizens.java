import java.util.Scanner;

public class Senior_Citizens {
    public static int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for size of array
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        sc.nextLine(); // FIX: Consume the leftover newline

        String[] details = new String[n];

        // Taking input for the array elements
        System.out.println("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            details[i] = sc.nextLine();
        }

        // Printing the count of senior citizens
        System.out.println("Number of senior citizens: " + countSeniors(details));

        sc.close(); // Close Scanner to prevent resource leaks
    }
}
