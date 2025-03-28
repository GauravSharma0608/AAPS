import java.util.Scanner;

public class Middle_of_An_Array {
    public static int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n+1];
        pre[0] = 0;
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]+nums[i-1];
        }
        int suf[] = new int[n+1];
        suf[n-1] = 0;
        for(int i=n-2;i>=0;i--){
            suf[i] = suf[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            if(pre[i]==suf[i]) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");

        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter " + n + " Elements : ");
        for(int i =0; i<n; i++ ){
            nums[i] = sc.nextInt();
        }
        System.out.println(findMiddleIndex(nums));

    }
}
