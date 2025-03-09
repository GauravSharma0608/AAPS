import java.util.*;
//
//public class Triplet {
//
//    public static int Triplet_sum(int[]arr, int x){
//        int n =arr.length;
//        int ans = 0;
//        for(int i=0; i<n; i++){
//            for(int j= i+1; j<n; j++){
//                for(int k =j+1; k<n; k++){
//                    if(arr[i]+arr[j]+arr[k] == x){
//                        ans++;
//                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
//                    }
//
//
//                }
//            }
//        }
//        return ans;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of an array :");
//        int n= sc .nextInt();
//
//        int[] arr = new int[n];
//        System.out.println("Enter  " + n + " Elements : ");
//        for(int i =0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter value of x :");
//        int x = sc.nextInt();
//
//        System.out.println(Triplet_sum(arr,x));
//
//    }
//}

// 2.optimal Approach

public class Triplet {

    public static void findTriplet(int[] arr, int target) {
        int n = arr.length;

        // Sort the array to enable efficient checking using two-pointer technique
        Arrays.sort(arr);

        // Iterate over the array and find pairs with the help of a HashSet
        for (int i = 0; i < n - 2; i++) {
            // To avoid checking the same element as the first element in the triplet again
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            // Set to keep track of the elements we've already visited
            HashSet<Integer> seen = new HashSet<>();
            int currentTarget = target - arr[i]; // The sum we want to find with the remaining two elements

            // Now, use the two-pointer technique or HashSet to find the pair
            for (int j = i + 1; j < n; j++) {
                int complement = currentTarget - arr[j];

                // If the complement exists in the set, we've found the triplet
                if (seen.contains(complement)) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ", " + complement + ")");
                }

                // Add the current element to the set
                seen.add(arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum:");
        int target = sc.nextInt();

        // Find and print the triplets
        findTriplet(arr, target);
    }
}

