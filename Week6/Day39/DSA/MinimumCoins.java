import java.util.*;

public class MinimumCoins {

    public static int minCoins(int[] coins, int amount) {

        Arrays.sort(coins);

        int count = 0;

        for (int i = coins.length - 1; i >= 0; i--) {

            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }

        return amount == 0 ? count : -1;
    }

    public static void main(String[] args) {

        int[] coins = {1, 5, 10, 25};

        int amount = 41;

        System.out.println("Minimum coins: "
                + minCoins(coins, amount));
    }
}