import java.util.Arrays;

public class Plus_One {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public static void main(String[] args) {
        Plus_One obj = new Plus_One();

        int[] digits = {9, 9, 9};  // Example input
        int[] result = obj.plusOne(digits);

        System.out.println("Result after plus one: " + Arrays.toString(result));
    }
}
