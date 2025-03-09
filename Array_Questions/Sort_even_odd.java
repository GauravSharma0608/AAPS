
//Given an array of integers sort the array in such a way so that all the even integres moves
//at the beginning of the array and odd integers follows


import java.util.Scanner;

public class Sort_even_odd {
    public static void print_array(int[]arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int[]arr,int i,int j){
        int n = arr.length;
//        i=0; j=n-1;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void sort_Even_odd(int[] arr){
        int n = arr.length;
       int left=0;  int right=n-1;
        while(left<right){
            if(arr[left]%2 ==1 && arr[right]%2 ==0 ){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
        int n= sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter " + n + " elements");
        for(int i= 0;i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array:");
        print_array(arr);

        sort_Even_odd(arr);
        System.out.println(" Sorted Array:");
        print_array(arr);
    }
}
