
import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {

    public static void coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        int[] selectedCoin = new int[amount + 1];

        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        // Dynamic Programming
        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {

                if (coin <= i && dp[i - coin] != amount + 1) {

                    if (dp[i - coin] + 1 < dp[i]) {

                        dp[i] = dp[i - coin] + 1;
                        selectedCoin[i] = coin;
                    }
                }
            }
        }

        // Display DP Table
        System.out.println("\nDP Table:");

        for (int i = 0; i <= amount; i++) {
            System.out.printf("%4d", dp[i] > amount ? -1 : dp[i]);
        }

        System.out.println();

        // Result
        if (dp[amount] > amount) {

            System.out.println("\nChange cannot be made.");

        } else {

            System.out.println("\nMinimum coins required: " + dp[amount]);

            System.out.print("Selected coins: ");

            int current = amount;

            while (current > 0) {

                int coin = selectedCoin[current];

                System.out.print(coin + " ");

                current -= coin;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of coins: ");
        int n = sc.nextInt();

        int[] coins = new int[n];

        System.out.println("Enter coin denominations:");

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();

            if (coins[i] <= 0) {
                System.out.println("Coin values must be positive.");
                sc.close();
                return;
            }
        }

        System.out.print("Enter target amount: ");
        int amount = sc.nextInt();

        if (amount < 0) {
            System.out.println("Amount cannot be negative.");
        } else {
            coinChange(coins, amount);
        }

        sc.close();
    }
}
