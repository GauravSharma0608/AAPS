import java.util.Arrays;

public class IntersectionOfArrays {
    public int[] intersection_of_arrays(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0, k = 0;
        int[] temp = new int[Math.min(n1, n2)];

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                if (k == 0 || temp[k - 1] != a[i]) {
                    temp[k++] = a[i];
                }
                i++;
                j++;
            }
            }
            return Arrays.copyOf(temp, k);

        }

        public static void main (String[]args){
            IntersectionOfArrays obj = new IntersectionOfArrays();
            int[] result = obj.intersection_of_arrays(new int[]{1, 2, 2, 1}, new int[]{2, 2});
            System.out.println(Arrays.toString(result));
        }
    }

