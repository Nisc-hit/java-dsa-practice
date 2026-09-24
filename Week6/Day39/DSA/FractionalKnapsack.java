import java.util.*;

public class FractionalKnapsack {

    static class Item {
        int value, weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public static double getMaxValue(Item[] items, int capacity) {

        Arrays.sort(items, (a, b) ->
            Double.compare(
                (double) b.value / b.weight,
                (double) a.value / a.weight
            )
        );

        double totalValue = 0;

        for (Item item : items) {

            if (capacity >= item.weight) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue +=
                    ((double) item.value / item.weight) * capacity;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {

        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };

        int capacity = 50;

        System.out.println("Maximum value: "
                + getMaxValue(items, capacity));
    }
}