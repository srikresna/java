public class Anu {
    public static void main(String[] args) {
        int[][] bookStores = {
                { 8, 9, 5, 2 }, // Dieng
                { 7, 5, 10, 3 }, // Soehat
                { 4, 6, 6, 5 }, // Sengkaling
        };
        int[] prices = { 40000, 28000, 60000, 75000 };
        String[] branchNames = { "Dieng", "Soehat", "Sengkaling" };

        // buku terjual
        for (int row = 0; row < bookStores.length; row++) {
            int bookSoldTotal = 0;
            for (int col = 0; col < bookStores[row].length; col++) {
                bookSoldTotal += bookStores[row][col];
            }
            System.out.printf("Buku yg terjual pada cabang %s adalah sebanyak %d\n", branchNames[row], bookSoldTotal);
        }

        System.out.println("====================");

        // total pemasukan
        int overallTotal = 0;
        for (int row = 0; row < bookStores.length; row++) {
            int totalProfit = 0;
            for (int col = 0; col < bookStores[row].length; col++) {
                totalProfit += bookStores[row][col] * prices[col];
            }
            overallTotal += totalProfit;
            System.out.printf("Total pemasukan pada cabang %s adalah sebanyak %d\n", branchNames[row], totalProfit);
        }
        System.out.printf("Total pemasukan seluruh cabang adalah sebanyak %d\n", overallTotal);

        System.out.println("====================");

        // cabang dengan pemasukan tertinggi
        String highestSoldBranchName = "";
        int previousHighest = 0;
        for (int row = 0; row < bookStores.length; row++) {
            int totalProfit = 0;
            for (int col = 0; col < bookStores[row].length; col++) {
                totalProfit += bookStores[row][col] * prices[col];
            }
            if (totalProfit > previousHighest) {
                highestSoldBranchName = branchNames[row];
                previousHighest = totalProfit;
            }
        }
        System.out.printf("Cabang dengan pemasukan tertinggi adalah %s dengan pemasukan sebanyak %d\n",
                highestSoldBranchName, previousHighest);
    }
}