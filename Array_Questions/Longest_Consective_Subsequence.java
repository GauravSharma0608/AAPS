import java.util.Arrays;

public class Longest_Consective_Subsequence {
    public static int Longest_cons_subsequence(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
         int CurrenLen = 1;
         int MaxLen = 1;

         for(int i =1; i<n; i++){
             if(arr[i] == arr[i-1]){
                 continue;
             }else if(arr[i] == arr[i-1] + 1){
                 CurrenLen++;
                 MaxLen = Math.max(MaxLen,CurrenLen);
             }else{
                 CurrenLen = 1;
             }

         }
        return MaxLen;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive subsequence length: " + Longest_cons_subsequence(arr));
    }

}
