public class Maximum_Population_Year {


        public int maximumPopulation(int[][] logs) {
            int pop[] = new int[2051], res = 1950;

            // Mark birth and death years
            for (var l : logs) {
                ++pop[l[0]];  // Increase population at birth year
                --pop[l[1]];  // Decrease population at death year
            }

            // Compute prefix sum to get actual population for each year
            for (int i = 1951; i < 2050; ++i) {
                pop[i] += pop[i - 1];
                if (pop[i] > pop[res]) {
                    res = i;  // Update result if current year has more population
                }
            }
            return res;
        }

        // Sample Test Case
        public static void main(String[] args) {
            Maximum_Population_Year sol = new Maximum_Population_Year();
            int[][] logs = {
                    {1993, 1999},
                    {2000, 2010},
                    {1975, 2005},
                    {1980, 1990}
            };
            System.out.println("Maximum Population Year: " + sol.maximumPopulation(logs));
        }
    }
