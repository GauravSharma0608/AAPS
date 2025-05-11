import java.util.HashMap;
import java.util.Map;

public class Majority_Element1 {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Majority_Element1 obj = new Majority_Element1();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element is: " + obj.majorityElement(nums));
    }
}
