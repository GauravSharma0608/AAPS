import java.util.Scanner;

public class Check_if_Array_Is_Sorted_and_Rotated {
    public static boolean check(int [] arr){
        int n  = arr.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] > arr[(i+1)%n]){
                count++;
            }
        }
        return count <=1;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n =sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter " + n + " Elements: ");
        for(int i = 0; i<n; i++ ){
            arr[i] = sc.nextInt();

        }
        System.out.println(check(arr));
    }
}
