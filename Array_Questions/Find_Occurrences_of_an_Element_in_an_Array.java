import java.util.ArrayList;
import java.util.List;

public class Find_Occurrences_of_an_Element_in_an_Array {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int len=nums.length;
        List<Integer> nm = new ArrayList<Integer>();
        for(int i=0;i<len;i++)
        {
            if(x==nums[i])
            {
                nm.add(i);
            }
        }
        len=queries.length;
        int ans[]=new int[len];
        for(int i=0;i<len;i++)
        {
            int val=queries[i];
            ans[i] = val > nm.size() ? -1 : nm.get(val-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Find_Occurrences_of_an_Element_in_an_Array obj = new Find_Occurrences_of_an_Element_in_an_Array();

        int[] nums = {1, 2, 3, 3, 3, 4, 5};
        int[] queries = {1, 2, 3, 4}; // Find the 1st, 2nd, 3rd, and 4th occurrence of 3
        int x = 3;

        int[] result = obj.occurrencesOfElement(nums, queries, x);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
