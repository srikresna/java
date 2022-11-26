public class array2dpractice {
    public static void main(String[] args) {
        int[][] bookStore = {
                { 8, 9, 5, 2 },
                { 7, 5, 10, 3 },
                { 4, 6, 6, 5 }
        };
        int[] prices = { 40000, 28000, 60000, 75000 };
        String[] branch = { "Dieng", "Soehat", "Sengkaling" };

        // book sold 
        for (int row = 0; row < bookStore.length; row++) {
        int bookSold = 0;
            for (int colm = 0; colm < bookStore[row].length; colm++) {
                bookSold += bookStore[row][colm];
            }
            System.out.printf(
                "Total the selling of book in %s is %d\n",
                branch[row],
                bookSold
                );
        }
        System.out.println(
            "----------------------------------------------------------"
        );

        //total income
        int totalProfit = 0;
        for (int row = 0; row < bookStore.length; row++) {
        int profit = 0;
            for (int colm = 0; colm < bookStore[row].length; colm++) {
                profit += bookStore[row][colm] * prices[colm];
            }
            totalProfit += profit;
            System.out.printf(
                "Income total Togamas in %s is %d\n",
                branch[row],
                profit
            );
        }
        System.out.printf("\nIncome total from all branch is %d\n",
        totalProfit
        );
        System.out.println(
            "----------------------------------------------------------"
        );

        //brachs with higher income
        int previousHighest = 0;
        String highestBranch = "";
        for (int row = 0; row < bookStore.length; row++) {
        int profit = 0;
            for (int colm = 0; colm < bookStore[row].length; colm++) {
                profit += bookStore[row][colm] * prices[colm];
            }
            if (profit > previousHighest) {
            highestBranch = branch[row];
            previousHighest = profit;
            }
        }
        System.out.printf(
            "Branch with highest income is %s with total income %d \n",
            highestBranch,
            previousHighest
        );
        
    }
}
