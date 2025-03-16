import java.util.*;
public class Kid_with_maximum_Candies {
    public  static List<Boolean> kid_with_max_candies (int [] Candies ,int extra_candies){
        int maxCandies = 0;
        for(int candy : Candies){
            maxCandies = Math.max(maxCandies,candy);
        }

        List<Boolean> result = new ArrayList<>();
        for (int candy : Candies){
            if(candy + extra_candies>= maxCandies){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n= sc.nextInt();

        int[] Candies= new int[n];
        System.out.println("Enter " +n+ " Elements: ");
        for(int i=0; i<n; i++) {
            Candies[i] = sc.nextInt();
        }
            System.out.println("Enter Extra_Candies : ");
            int extra_candies = sc.nextInt();

        System.out.println(kid_with_max_candies(Candies,extra_candies));

    }
}

