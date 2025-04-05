import java.util.*;
public class Roman_To_Integer {

        // Roman to Integer
        public int romanToInt(String s) {
            if (s == null || s.isEmpty()) return 0;

            Map<Character, Integer> roman = Map.of(
                    'I', 1,
                    'V', 5,
                    'X', 10,
                    'L', 50,
                    'C', 100,
                    'D', 500,
                    'M', 1000
            );

            int res = 0;

            for (int i = 0; i < s.length() - 1; i++) {
                int curr = roman.get(s.charAt(i));
                int next = roman.get(s.charAt(i + 1));
                res += (curr < next) ? -curr : curr;
            }

            return res + roman.get(s.charAt(s.length() - 1));
        }

        // Integer to Roman
        public String intToRoman(int num) {
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] romans = {
                    "M", "CM", "D", "CD", "C", "XC",
                    "L", "XL", "X", "IX", "V", "IV", "I"
            };

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < values.length && num > 0; i++) {
                while (num >= values[i]) {
                    num -= values[i];
                    sb.append(romans[i]);
                }
            }

            return sb.toString();
        }

        // Main method for testing
        public static void main(String[] args) {
            Roman_To_Integer sol = new Roman_To_Integer ();

            // Test Roman to Integer
            String roman = "MCMXCIV"; // 1994
            int intValue = sol.romanToInt(roman);
            System.out.println("Roman to Int (" + roman + "): " + intValue);

            // Test Integer to Roman
            int number = 2024;
            String romanValue = sol.intToRoman(number);
            System.out.println("Int to Roman (" + number + "): " + romanValue);
        }
    }

}
