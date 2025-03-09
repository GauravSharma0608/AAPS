import java.util.Scanner;

public class Duplicate {

    public static int duplicate_elements(int[]arr){
        int n = arr.length;
        int ans =0;
        for(int i=0; i<n; i++){
            for(int j =i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    System.out.print("(" + arr[i] + ")");
                    ans++;
                }
            }
        }
        return ans;
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
//        duplicate_elements(arr);
        System.out.println("Duplicate elements :" +duplicate_elements(arr));
    }
}
