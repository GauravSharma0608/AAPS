import java.util.ArrayList;
import java.util.List;

public class Insert_Intervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        for(int[] in:intervals){
            if(in[1]<newInterval[0]){
                result.add(in);
            }
            else if(newInterval[1]<in[0]){
                result.add(newInterval);
                newInterval = in;
            }
            else{
                newInterval[0] = Math.min(newInterval[0], in[0]);
                newInterval[1] = Math.max(newInterval[1], in[1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        Insert_Intervals obj = new Insert_Intervals();

        int[][] intervals = { {1, 3}, {6, 9} };
        int[] newInterval = {2, 5};

        int[][] result = obj.insert(intervals, newInterval);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + "," + interval[1] + "] ");
        }
    }

}
