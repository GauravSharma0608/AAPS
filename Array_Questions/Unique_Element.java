
import java.util.Scanner;

public class Unique_Element {

    public static int Find_Unique_element(int [] arr){

        //approach 1
        int n= arr.length;
        int unique =0;
        for(int num: arr){
            unique^= num;
        }
        return unique;



//        int n= arr.length;
//        for(int i=0; i<n; i++){
//            for(int j =i+1; j<n; j++){
//                if(arr[i] == arr[j]){
//                    arr[i]=-1;
//                    arr[j]=-1;
//                }
//            }
//        }
//        int ans =-1;
//        for(int i=0; i<n; i++){
//            if(arr[i]>0){
//                ans= arr[i];
//            }
//        }
//        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

//        int uniqueElement = Find_Unique_element(arr);
//        System.out.println("The unique element is: " + uniqueElement);
        System.out.println(Find_Unique_element(arr));
    }
}
