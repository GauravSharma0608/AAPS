public class Square_root {
    int floorSqrt(int n) {
        // Your code here
        int low = 0, high = n;

        while(high>=low){
            int mid = (low+high)/2;
            if(mid*mid <= n){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        Square_root obj = new Square_root();

        int n = 17; // you can change this to test other values
        int result = obj.floorSqrt(n);

        System.out.println("Floor of square root of " + n + " is: " + result);
    }
}
