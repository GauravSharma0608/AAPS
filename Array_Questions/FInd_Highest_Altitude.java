import java.util.Scanner;

public  class FInd_Highest_Altitude {
    public  static int largestAltitude(int[] arr) {
        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int i = 0; i < arr.length; i++) {
            currentAltitude += arr[i];
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n= sc.nextInt();

        int[] arr= new int[n];
        System.out.println("Enter " +n+ " Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(largestAltitude(arr));
    }
}
